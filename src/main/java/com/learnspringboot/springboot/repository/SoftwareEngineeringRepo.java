package com.learnspringboot.springboot.repository;

import com.learnspringboot.springboot.Model.SoftwareEngineer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareEngineeringRepo extends
        JpaRepository<SoftwareEngineer,Integer> {
}
