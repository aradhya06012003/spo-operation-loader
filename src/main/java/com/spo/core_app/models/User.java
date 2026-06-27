package com.spo.core_app.models;

import com.spo.core_app.ennums.UserStatus;
import com.spo.core_app.ennums.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User extends GlobalRecord{

    private String userId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    private String addressLine1;

    private String addressLine2;

    private String addressLine3;

    private String joiningDate;

    private String lastLoginDate;

    private Boolean emailVerified;

    private String mfaEnabled;
}
