package uz.abdurahmon.socailuserservice.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.TimeZoneColumn;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@SuppressWarnings("JpaDataSourceORMInspection")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String username;
    private String bio;
    private String email;
    private String phone;
    private Long attachmentId;
    @TimeZoneColumn
    private LocalDateTime createdAt;
    @TimeZoneColumn
    private LocalDateTime updatedAt;
}