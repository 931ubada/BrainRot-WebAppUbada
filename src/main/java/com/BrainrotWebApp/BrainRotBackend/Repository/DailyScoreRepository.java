package com.BrainrotWebApp.BrainRotBackend.Repository;

import com.BrainrotWebApp.BrainRotBackend.Entity.DailyScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyScoreRepository extends JpaRepository<DailyScore,Long> {
}
