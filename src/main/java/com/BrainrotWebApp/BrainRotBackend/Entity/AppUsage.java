package com.BrainrotWebApp.BrainRotBackend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "App Usage")
public class AppUsage
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "session_id",nullable = false)
    private DeviceSessions sessions;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users user;

    private String AppName;

    /*@ManyToOne
    @JoinColumn(name = "app_category_id")
    private AppCategory appCategory;*/

    private String websiteURL;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer duration;
    private LocalDateTime createdAt= LocalDateTime.now();
}
