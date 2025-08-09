package com.BrainrotWebApp.BrainRotBackend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Device Sessions")
public class DeviceSessions
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;*/

    private String deviceName;
    private String deviceType;
    private LocalDateTime sessionStart;
    private LocalDateTime sessionEnd;
    private Integer totalDuration;
    private LocalDateTime createdAt = LocalDateTime.now();

}
