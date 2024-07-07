package com.officeseatbooking.PlaceYourStation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.officeseatbooking.PlaceYourStation.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
