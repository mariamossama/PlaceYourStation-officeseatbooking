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
@Table(name = "stationAssignment")
@Builder
public class StationAssignment {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatAssignmentId;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office office;
}
