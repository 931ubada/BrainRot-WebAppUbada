package com.BrainrotWebApp.BrainRotBackend.Services;

import com.BrainrotWebApp.BrainRotBackend.Entity.AppUsage;
import com.BrainrotWebApp.BrainRotBackend.Repository.AppUsageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUsageService
{
    @Autowired
    private AppUsageRepository appUsageRepository;
    public List<AppUsage> GetAllAppUsage()
    {
        return appUsageRepository.findAll();
    }

    public AppUsage AddAppUsage(AppUsage appUsage)
    {
        return appUsageRepository.save(appUsage);
    }


    public AppUsage UpdateAppUsage(Long id, AppUsage appUsage)
    {
        AppUsage appUsage1=appUsageRepository.findById(id).orElse(null);
        appUsage1.setAppName(appUsage.getAppName());
        //appUsage1.setId(appUsage.getId());
        appUsage1.setSessions(appUsage.getSessions());
        appUsage1.setDuration(appUsage.getDuration());
        appUsage1.setStartTime(appUsage.getStartTime());
        appUsage1.setEndTime(appUsage.getEndTime());
        appUsage1.setCreatedAt(appUsage.getCreatedAt());
        appUsage1.setWebsiteURL(appUsage.getWebsiteURL());
        return appUsageRepository.save(appUsage1);
    }

    public AppUsage DeleteAppUsage(Long id)
    {
        AppUsage appUsage=appUsageRepository.findById(id).orElse(null);
        if (appUsage !=null)
            appUsageRepository.delete(appUsage);
        return appUsage;
    }
}
