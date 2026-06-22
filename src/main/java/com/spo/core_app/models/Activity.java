package com.spo.core_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "activities")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Activity extends GlobalRecord {
    private String comment;
    private User user;
}
