package com.fitness.activityservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserValidationService {

    private final WebClient userServiceWebClient;

    public boolean validateUser(String userId) {

        log.info("Calling User Validation API for userId: {}", userId);

        try {

            Boolean response = userServiceWebClient.get()
                    .uri("/users/{userId}/validate", userId)
                    .retrieve()
                    .bodyToMono(Boolean.class)
                    .block();

            log.info("User Service response for {} = {}", userId, response);

            return Boolean.TRUE.equals(response);

        } catch (Exception e) {

            log.error("Error while validating user {}: {}", userId, e.getMessage(), e);

            return false;
        }
    }
}