package com.fitness.activityservice.controller;

import com.fitness.activityservice.dto.ActivityRequest;
import com.fitness.activityservice.dto.ActivityResponse;
import com.fitness.activityservice.service.ActivityService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

@AllArgsConstructor
@RequestMapping("/activities")
public class ActivityController {
    private ActivityService activityService;

    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(
            @RequestBody ActivityRequest request,
            @RequestHeader("X-User-ID") String userId) {

        System.out.println("X-User-ID = " + userId);

        if (userId != null) {
            request.setUserId(userId);
        }

        System.out.println("Request userId = " + request.getUserId());

        return ResponseEntity.ok(activityService.trackActivity(request));
    }
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<ActivityResponse>> getUserActivities(
            @PathVariable String userId) {

        return ResponseEntity.ok(activityService.getUserActivities(userId));
    }

    @GetMapping("/{activityId}")
    public ResponseEntity<ActivityResponse> getActivity(@PathVariable String activityId){
        return ResponseEntity.ok(activityService.getActivityById(activityId));
    }

}
