package com.officeseatbooking.PlaceYourStation.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.officeseatbooking.PlaceYourStation.Entity.Station;

public interface StationRepository extends JpaRepository<Station, Long> {
    List<Station> findByIsAvailable(boolean isAvailable);
}