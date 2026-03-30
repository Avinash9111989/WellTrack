package com.welltrack.iam.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long userId;

 private String name;

 @Column(unique = true)
 private String email;

 private String password;

 @Enumerated(EnumType.STRING)
 private Role role;

 private String phone;
 private String status; // ACTIVE / INACTIVE
}