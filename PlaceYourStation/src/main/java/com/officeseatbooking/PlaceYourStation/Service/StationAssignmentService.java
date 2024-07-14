package com.officeseatbooking.PlaceYourStation.Service;

import com.officeseatbooking.PlaceYourStation.Entity.StationAssignment;
import com.officeseatbooking.PlaceYourStation.Repo.StationAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StationAssignmentService {

    @Autowired
    private StationAssignmentRepository stationAssignmentRepository;

    public StationAssignment assignSeat(StationAssignment stationAssignment) {
        return stationAssignmentRepository.save(stationAssignment);
    }

    public List<StationAssignment> getAllAssignments() {
        return stationAssignmentRepository.findAll();
    }

    public Optional<StationAssignment> getAssignmentById(Long id) {
        return stationAssignmentRepository.findById(id);
    }

    public void deleteAssignment(Long id) {
        stationAssignmentRepository.deleteById(id);
    }
}
