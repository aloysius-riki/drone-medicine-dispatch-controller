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
                   "Model1",
                   "State1"
           );
           Drone two = new Drone(
                   "SerialNumber2",
                   200,
                   20,
                   "Model2",
                   "State2"
           );

           droneRepository.saveAll(
                   List.of(one, two)
           );
        } ;
    }
}
