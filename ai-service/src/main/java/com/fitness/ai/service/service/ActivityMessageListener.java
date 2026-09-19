package com.fitness.ai.service.service;

import com.fitness.ai.service.model.Activity;
import com.fitness.ai.service.model.Recommendation;
import com.fitness.ai.service.repository.RecommendationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ActivityMessageListener {

    private final ActivityAiService aiService;
    private final RecommendationRepository recommendationRepository;

    @RabbitListener(queues = "activity.queue")
    public void processActivity(Activity activity) {

        log.info("========== ACTIVITY RECEIVED ==========");
        log.info("Activity ID: {}", activity.getId());

        try {

            Recommendation recommendation =
                    aiService.generateRecommendation(activity);

            log.info("========== RECOMMENDATION GENERATED ==========");
            log.info("Recommendation: {}", recommendation);

            Recommendation savedRecommendation =
                    recommendationRepository.save(recommendation);

            log.info("========== RECOMMENDATION SAVED ==========");
            log.info("Saved ID: {}", savedRecommendation.getId());

        } catch (Exception e) {

            log.error("Failed to generate recommendation for activity: {}",
                    activity.getId(), e);
        }
    }
}