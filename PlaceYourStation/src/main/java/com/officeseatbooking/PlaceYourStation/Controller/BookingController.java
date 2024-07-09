package com.officeseatbooking.PlaceYourStation.Controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.officeseatbooking.PlaceYourStation.Entity.Booking;
import com.officeseatbooking.PlaceYourStation.Entity.Station;
import com.officeseatbooking.PlaceYourStation.Service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public ResponseEntity<Booking> bookSeat(@RequestParam Long seatId, @RequestParam Long userId,
                                            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startTime,
                                            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endTime) {
        Booking booking = bookingService.bookSeat(seatId, userId, startTime, endTime);
        return ResponseEntity.ok(booking);
    }

    @GetMapping("/available-seats")
    public ResponseEntity<List<Station>> getAvailableSeats() {
        List<Station> seats = bookingService.getAvailableSeats();
        return ResponseEntity.ok(seats);
    }
}
