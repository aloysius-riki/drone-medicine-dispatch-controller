package net.mttr.dronerestapiservice.drone;

import net.mttr.dronerestapiservice.medication.Medication;
import net.mttr.dronerestapiservice.medication.MedicationRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Configuration
public class DroneConfig {

    @Bean
    CommandLineRunner commandLineRunner(DroneRepository droneRepository,
                                        MedicationRepository medicationRepository
                                        ){
       return args -> {
           Medication medication1 = new Medication(
                   "Name1",
                   100,
                   "Medication1",
                   "1.png"
           );
           medicationRepository.save(medication1);

           //create endpoint to do the sme but findmedication by name instead
           //that way you can create drones null if they are not mid delivery

           Medication medication2 = new Medication(
                   "Name2",
                   100,
                   "Medication2",
                   "2.png"
           );
           medicationRepository.save(medication2);

           Drone one = new Drone(
                   "SerialNumber1",
                   100,
                   10,
                   "Lightweight",
                   "RETURNING"
           );

           one.setMedication(Set.of(medication1, medication2));

           Drone two = new Drone(
                   "SerialNumber2",
                   150,
                   15,
                   "Lightweight",
                   "RETURNING"
           );

           two.setMedication(Set.of(medication1, medication2));

           Drone three = new Drone(
                   "SerialNumber3",
                   180,
                   20,
                   "Middleweight",
                   "RETURNING"
           );

           Drone four = new Drone(
                   "SerialNumber4",
                   200,
                   40,
                   "Middleweight",
                   "DELIVERED"
           );

           Drone five = new Drone(
                   "SerialNumber5",
                   250,
                   65,
                   "Cruiserweight",
                   "DELIVERING"
           );

           Drone six = new Drone(
                   "SerialNumber6",
                   300,
                   80,
                   "Cruiserweight",
                   "DELIVERING"
           );

           Drone seven = new Drone(
                   "SerialNumber7",
                   350,
                   85,
                   "Cruiserweight",
                   "LOADED"
           );

           Drone eight = new Drone(
                   "SerialNumber8",
                   400,
                   90,
                   "Heavyweight",
                   "LOADING"
           );

           Drone nine = new Drone(
                   "SerialNumber9",
                   450,
                   95,
                   "Heavyweight",
                   "IDLE"
           );

           Drone ten = new Drone(
                   "SerialNumber10",
                   500,
                   100,
                   "Heavyweight",
                   "IDLE"
           );

           droneRepository.saveAll(
                   List.of(one, two, three, four, five, six, seven, eight, nine, ten)
           );
        } ;
    }
}
