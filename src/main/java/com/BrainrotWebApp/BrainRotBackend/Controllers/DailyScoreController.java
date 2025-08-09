package com.BrainrotWebApp.BrainRotBackend.Controllers;

import com.BrainrotWebApp.BrainRotBackend.Entity.DailyScore;
import com.BrainrotWebApp.BrainRotBackend.Services.DailyScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/daily_score")
public class DailyScoreController
{
    @Autowired
    private DailyScoreService dailyScoreService;

    @GetMapping("/fetch")
    public ResponseEntity<List<DailyScore>> GetDailyScore()
    {
        return ResponseEntity.ok(dailyScoreService.GetDailyScore());
    }

    @PostMapping
    public ResponseEntity<DailyScore> addDailyScore(@RequestBody DailyScore dailyScore)
    {
        return ResponseEntity.ok(dailyScoreService.addDailyScore(dailyScore));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DailyScore> updateDailyScore(@PathVariable Long id,@RequestBody DailyScore dailyScore)
    {
        return ResponseEntity.ok(dailyScoreService.updateDailyScore(id,dailyScore));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DailyScore> deleteDailyScore(@PathVariable Long id)
    {
        return ResponseEntity.ok(dailyScoreService.deleteDailyScore(id));
    }
}
