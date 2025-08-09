package com.BrainrotWebApp.BrainRotBackend.Services;

import com.BrainrotWebApp.BrainRotBackend.Entity.DailyScore;
import com.BrainrotWebApp.BrainRotBackend.Repository.DailyScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DailyScoreService
{
    @Autowired
    private DailyScoreRepository dailyScoreRepository;

    public List<DailyScore> GetDailyScore()
    {
        return dailyScoreRepository.findAll();
    }

    public DailyScore addDailyScore(DailyScore dailyScore)
    {

        return dailyScoreRepository.save(dailyScore);
    }

    public DailyScore updateDailyScore(Long id, DailyScore dailyScore)
    {
        DailyScore dailyScore1=dailyScoreRepository.findById(id).orElse(null);
        dailyScore1.setScoreDate(dailyScore.getScoreDate());
        //dailyScore1.setId(dailyScore.getId());
        dailyScore1.setTotalScreenTime(dailyScore.getTotalScreenTime());
        dailyScore1.setFocusScore(dailyScore.getFocusScore());
        dailyScore1.setProductivityScore(dailyScore.getProductivityScore());
        dailyScore1.setToxicityScore(dailyScore.getToxicityScore());
        dailyScore1.setAppSwitchCount(dailyScore.getAppSwitchCount());
        dailyScore1.setCreatedAt(dailyScore.getCreatedAt());
        dailyScore1.setEveningUsageMinutes(dailyScore.getEveningUsageMinutes());
        return dailyScoreRepository.save(dailyScore1);
    }

    public DailyScore deleteDailyScore(Long id)
    {
        DailyScore dailyScore2=dailyScoreRepository.findById(id).orElse(null);
        if (dailyScore2 !=null)
            dailyScoreRepository.delete(dailyScore2);
        return dailyScore2;
    }
}
