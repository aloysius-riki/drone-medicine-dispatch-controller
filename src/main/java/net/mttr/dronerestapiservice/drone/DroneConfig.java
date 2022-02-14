package net.mttr.dronerestapiservice.drone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DroneConfig {

    @Bean
    CommandLineRunner commandLineRunner(DroneRepository droneRepository){
       return args -> {
           Drone one = new Drone(
                   "SerialNumber1",
                   100,
                   10,
                   "Lightweight",
                   "RETURNING",
                   "Medication1"
           );
           Drone two = new Drone(
                   "SerialNumber2",
                   150,
                   15,
                   "Lightweight",
                   "RETURNING",
                   "Medication2"
           );
           Drone three = new Drone(
                   "SerialNumber1",
                   180,
                   20,
                   "Middleweight",
                   "RETURNING",
                   "Medication1"
           );
           Drone four = new Drone(
                   "SerialNumber1",
                   200,
                   40,
                   "Middleweight",
                   "DELIVERED",
                   "Medication1"
           );
           Drone five = new Drone(
                   "SerialNumber1",
                   250,
                   65,
                   "Cruiserweight",
                   "DELIVERING",
                   "Medication1"
           );
           Drone six = new Drone(
                   "SerialNumber1",
                   300,
                   80,
                   "Cruiserweight",
                   "DELIVERING",
                   "Medication1"
           );
           Drone seven = new Drone(
                   "SerialNumber1",
                   350,
                   85,
                   "Cruiserweight",
                   "LOADED",
                   "Medication1"
           );
           Drone eight = new Drone(
                   "SerialNumber1",
                   400,
                   90,
                   "Heavyweight",
                   "LOADING",
                   "Medication1"
           );
           Drone nine = new Drone(
                   "SerialNumber1",
                   450,
                   95,
                   "Heavyweight",
                   "IDLE",
                   "Medication9"
           );
           Drone ten = new Drone(
                   "SerialNumber10",
                   500,
                   100,
                   "Heavyweight",
                   "IDLE",
                   "Medication10"
           );

           droneRepository.saveAll(
                   List.of(one, two, three, four, five, six, seven,
                           eight, nine, ten)
           );
        } ;
    }
}
