package com.dinfactory.dincode.Entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "userId")
    private long userId;
    @Column(name = "userName")
    private String userName;
    @Column(name = "emailId")
    private String emailId;
    @Column(name = "mobileNo", unique = true, nullable = false, length = 10)
    private String mobileNo;
    @Column(name = "createTime", updatable = false, nullable = false)
    private final LocalDateTime createTime = LocalDateTime.now();
}
