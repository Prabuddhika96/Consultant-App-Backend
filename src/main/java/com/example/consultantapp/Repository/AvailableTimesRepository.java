package com.example.consultantapp.Repository;

import com.example.consultantapp.Model.AvailableTimes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailableTimesRepository extends JpaRepository<AvailableTimes,Integer> {
}
