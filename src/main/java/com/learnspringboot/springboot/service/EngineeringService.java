package com.learnspringboot.springboot.service;

import com.learnspringboot.springboot.Model.SoftwareEngineer;
import com.learnspringboot.springboot.repository.SoftwareEngineeringRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EngineeringService {

    SoftwareEngineeringRepo softwareEngineeringRepo;

    public EngineeringService(SoftwareEngineeringRepo softwareEngineeringRepo) {
        this.softwareEngineeringRepo = softwareEngineeringRepo;
    }

    public List<SoftwareEngineer> findAllEngineers(){
        return softwareEngineeringRepo.findAll();
    }

    public void create(SoftwareEngineer softwareEngineer) {
        softwareEngineeringRepo.save(softwareEngineer);
    }
}
