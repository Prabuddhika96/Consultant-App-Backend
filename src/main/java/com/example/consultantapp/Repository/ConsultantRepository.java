package com.example.consultantapp.Repository;

import com.example.consultantapp.Model.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultantRepository extends JpaRepository<Consultant,Integer> {
}
