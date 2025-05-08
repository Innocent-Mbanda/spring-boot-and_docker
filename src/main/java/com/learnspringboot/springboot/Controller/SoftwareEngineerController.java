package com.learnspringboot.springboot.Controller;

import com.learnspringboot.springboot.Model.SoftwareEngineer;
import com.learnspringboot.springboot.service.EngineeringService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")

public class SoftwareEngineerController {

    private EngineeringService engineeringService;

    public SoftwareEngineerController(EngineeringService engineeringService) {
        this.engineeringService = engineeringService;
    }


    @GetMapping
    public List<SoftwareEngineer> findAllSoftwareEngineers(){
         return engineeringService.findAllEngineers();
    }
    @PostMapping
    public void addSoftwareDeveloper( @RequestBody  SoftwareEngineer softwareEngineer){
        engineeringService.create(softwareEngineer);
    }


}
