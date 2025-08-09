package com.BrainrotWebApp.BrainRotBackend.Services;

import com.BrainrotWebApp.BrainRotBackend.Entity.DeviceSessions;
import com.BrainrotWebApp.BrainRotBackend.Repository.DeviceSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceSessionService
{
    @Autowired
    private DeviceSessionRepository deviceSessionRepository;

    public List<DeviceSessions> GetAllSession()
    {
        return deviceSessionRepository.findAll();
    }

    public DeviceSessions addSession(DeviceSessions deviceSessions)
    {
        return deviceSessionRepository.save(deviceSessions);
    }

    public DeviceSessions updateSession(Long id, DeviceSessions deviceSessions)
    {
        DeviceSessions deviceSessions1=deviceSessionRepository.findById(id).orElse(null);
        deviceSessions1.setDeviceName(deviceSessions.getDeviceName());
        deviceSessions1.setDeviceType(deviceSessions.getDeviceType());
        deviceSessions1.setSessionStart(deviceSessions.getSessionStart());
        deviceSessions1.setSessionEnd(deviceSessions.getSessionEnd());
        deviceSessions1.setTotalDuration(deviceSessions.getTotalDuration());
        deviceSessions1.setCreatedAt(deviceSessions.getCreatedAt());
        return deviceSessionRepository.save(deviceSessions1);
    }

    public DeviceSessions deleteSession(Long id)
    {
        DeviceSessions deviceSessions2=deviceSessionRepository.findById(id).orElse(null);
        if (deviceSessions2 != null)
            deviceSessionRepository.delete(deviceSessions2);
        return deviceSessions2;
    }
}
