package com.example.lab05.controller;

import com.example.lab05.dto.DashboardResponse;
import com.example.lab05.service.DashboardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/55-21247/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/{personName}")
    public ResponseEntity<DashboardResponse> getDashboard(@PathVariable String personName) {
        DashboardResponse dashboard = dashboardService.getDashboard(personName);
        return ResponseEntity.ok(dashboard);
    }
}
