package com.officeseatbooking.PlaceYourStation.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "office")
@Builder
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long officeId;

    private String officeName;
    private String address;
    
}
