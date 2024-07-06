package com.officeseatbooking.PlaceYourStation.Entity;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "The Name Field Is Required")
    private String userName;

    @NotBlank(message = "The Email Field Is Required")
    @Email
    private String email;

    @JsonIgnore
    private String password;    
}
