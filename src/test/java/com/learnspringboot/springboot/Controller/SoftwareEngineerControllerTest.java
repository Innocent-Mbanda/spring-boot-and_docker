package com.learnspringboot.springboot.Controller;

import com.learnspringboot.springboot.Model.SoftwareEngineer;
import com.learnspringboot.springboot.service.EngineeringService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class SoftwareEngineerControllerTest {

    @Mock
    private EngineeringService engineeringService;

    @InjectMocks
    private SoftwareEngineerController engineeringController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAllSoftwareEngineers() {
        // Arrange
        SoftwareEngineer backend = new SoftwareEngineer(1, "Alice", "Backend");
        SoftwareEngineer frontEnd = new SoftwareEngineer(2, "Bob", "Frontend");
        List<SoftwareEngineer> mockedSoftwareEngineers = Arrays.asList(backend, frontEnd);

        when(engineeringService.findAllEngineers()).thenReturn(mockedSoftwareEngineers);

        // Act
        List<SoftwareEngineer> result = engineeringController.findAllSoftwareEngineers();

        // Assert
        assertEquals(2, result.size());
        assertEquals("Alice", result.get(0).getName());
        verify(engineeringService).findAllEngineers();
    }

    @Test
    void testCreateSoftwareEngineer(){
        SoftwareEngineer softwareEngineer = new SoftwareEngineer(1,"Bob","full stack");
        engineeringService.create(softwareEngineer);
        verify(engineeringService).create(softwareEngineer);

        SoftwareEngineer result = engineeringController.addSoftwareDeveloper(softwareEngineer);
        assertEquals(1,result.getId());
        assertEquals("Bob",result.getName());
        assertEquals("full stack",result.getTechStack());

    }

}