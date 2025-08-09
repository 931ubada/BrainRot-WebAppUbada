package com.BrainrotWebApp.BrainRotBackend.Controllers;

import com.BrainrotWebApp.BrainRotBackend.Entity.DeviceSessions;
import com.BrainrotWebApp.BrainRotBackend.Services.DeviceSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/session")
@RestController
public class DeviceSessionController {
    @Autowired
    private DeviceSessionService deviceSessionService;

    @GetMapping("/fetch")
    public ResponseEntity<List<DeviceSessions>> GetAllSession()
    {
        return ResponseEntity.ok(deviceSessionService.GetAllSession());
    }

    @PostMapping
    public ResponseEntity<DeviceSessions> addSession(@RequestBody DeviceSessions deviceSessions)
    {
        return ResponseEntity.ok(deviceSessionService.addSession(deviceSessions));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DeviceSessions> updateSession(@PathVariable Long id,@RequestBody DeviceSessions deviceSessions)
    {
        return ResponseEntity.ok(deviceSessionService.updateSession(id,deviceSessions));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DeviceSessions> deleteSession(@PathVariable Long id)
    {
        return ResponseEntity.ok(deviceSessionService.deleteSession(id));
    }
}