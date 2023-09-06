package com.example.consultantapp.Repository;

import com.example.consultantapp.Model.LoginDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDetailsRepository extends JpaRepository<LoginDetails,Integer> {
}
