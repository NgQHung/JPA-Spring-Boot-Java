package com.example.jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue
    private UUID id;
    private String title;
    private String description;
}
