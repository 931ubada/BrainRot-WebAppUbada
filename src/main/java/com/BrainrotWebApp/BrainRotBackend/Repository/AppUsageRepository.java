package com.BrainrotWebApp.BrainRotBackend.Repository;

import com.BrainrotWebApp.BrainRotBackend.Entity.AppUsage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUsageRepository extends JpaRepository<AppUsage,Long> {
}
