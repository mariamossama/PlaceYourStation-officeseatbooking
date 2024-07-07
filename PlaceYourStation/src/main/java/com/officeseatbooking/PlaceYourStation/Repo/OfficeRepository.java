package com.officeseatbooking.PlaceYourStation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.officeseatbooking.PlaceYourStation.Entity.Office;

public interface OfficeRepository extends JpaRepository<Office, Long> {}