package com.BrainrotWebApp.BrainRotBackend.Controllers;

import com.BrainrotWebApp.BrainRotBackend.Entity.AppUsage;
import com.BrainrotWebApp.BrainRotBackend.Services.AppUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/app_usage")
@RestController
public class AppUsageController
{
    @Autowired
    private AppUsageService appUsageService;

    @GetMapping("/fetch")
    public ResponseEntity<List<AppUsage>> GetAllAppUsage()
    {
        return ResponseEntity.ok(appUsageService.GetAllAppUsage());
    }

    @PostMapping
    public ResponseEntity<AppUsage> AddAppUsage(@RequestBody AppUsage appUsage)
    {
        return ResponseEntity.ok(appUsageService.AddAppUsage(appUsage));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AppUsage> UpdateAppUsage(@PathVariable Long id,@RequestBody AppUsage appUsage)
    {
        return ResponseEntity.ok(appUsageService.UpdateAppUsage(id,appUsage));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AppUsage> DeleteAppUsage(@PathVariable Long id)
    {
        return ResponseEntity.ok(appUsageService.DeleteAppUsage(id));
    }
}
