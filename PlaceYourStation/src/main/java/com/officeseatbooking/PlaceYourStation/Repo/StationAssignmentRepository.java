package com.officeseatbooking.PlaceYourStation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.officeseatbooking.PlaceYourStation.Entity.StationAssignment;

public interface StationAssignmentRepository extends JpaRepository<StationAssignment, Long> {}
