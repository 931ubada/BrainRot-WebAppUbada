package com.BrainrotWebApp.BrainRotBackend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Daily Score")
public class DailyScore
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users user;

    @Column(name = "Score_date",nullable = false)
    private LocalDate scoreDate;

    private Integer totalScreenTime;
    private Double focusScore;
    private Double toxicityScore;
    private Double productivityScore;
    private Integer appSwitchCount;
    private Integer eveningUsageMinutes;
    private LocalDateTime createdAt= LocalDateTime.now();
}
