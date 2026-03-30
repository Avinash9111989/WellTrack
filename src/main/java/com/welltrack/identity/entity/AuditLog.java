
package com.welltrack.identity.entity;
import jakarta.persistence.*; import java.time.*; import lombok.*;
@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class AuditLog { @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long auditId; private Long userId; private String action; private String resource; private LocalDateTime timestamp; }
