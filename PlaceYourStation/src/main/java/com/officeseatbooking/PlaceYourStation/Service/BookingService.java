package com.officeseatbooking.PlaceYourStation.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.officeseatbooking.PlaceYourStation.Entity.Booking;
import com.officeseatbooking.PlaceYourStation.Entity.Station;
import com.officeseatbooking.PlaceYourStation.Repo.BookingRepository;
import com.officeseatbooking.PlaceYourStation.Repo.StationRepository;
import com.officeseatbooking.PlaceYourStation.Repo.UserRepository;

@Service
public class BookingService {
    @Autowired
    private StationRepository seatRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private UserRepository userRepository;

    public Booking bookSeat(Long seatId, Long userId, LocalDateTime startTime, LocalDateTime endTime) {
        Station seat = seatRepository.findById(seatId).orElseThrow(() -> new RuntimeException("Seat not found"));
        if (!seat.isAvailable()) {
            throw new RuntimeException("Seat is already booked");
        }

        com.officeseatbooking.PlaceYourStation.Entity.User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));

        seat.setAvailable(false);
        seatRepository.save(seat);

        Booking booking = new Booking();
        booking.setSeat(seat);
        booking.setUser(user);
        booking.setStartTime(startTime);
        booking.setEndTime(endTime);

        return bookingRepository.save(booking);
    }

    public List<Station> getAvailableSeats() {
        return seatRepository.findByIsAvailable(true);
    }
}
