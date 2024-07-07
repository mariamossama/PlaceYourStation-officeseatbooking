package com.officeseatbooking.PlaceYourStation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.officeseatbooking.PlaceYourStation.Entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {}
