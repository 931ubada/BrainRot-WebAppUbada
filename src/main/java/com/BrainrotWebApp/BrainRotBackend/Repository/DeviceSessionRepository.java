package com.BrainrotWebApp.BrainRotBackend.Repository;

import com.BrainrotWebApp.BrainRotBackend.Entity.DeviceSessions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceSessionRepository extends JpaRepository<DeviceSessions,Long> {
}
