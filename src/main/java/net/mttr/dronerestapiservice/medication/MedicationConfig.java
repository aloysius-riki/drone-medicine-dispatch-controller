package net.mttr.dronerestapiservice.medication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MedicationConfig {

    @Bean
    CommandLineRunner medicationCommandLineRunner(MedicationRepository medicationRepository){
        return args -> {
            Medication one = new Medication(
                    "Name1",
                    100,
                    "Medication1",
                    "1.png"
            );

            Medication medicationTwo = new Medication(
                    "Name2",
                    150,
                    "Medication2",
                    "2.png"
            );

            Medication three = new Medication(
                    "Name3",
                    180,
                    "Medication3",
                    "3.png"
            );

            Medication four = new Medication(
                    "Name4",
                    200,
                    "Medication4",
                    "4.png"
            );

            Medication five = new Medication(
                    "Name5",
                    250,
                    "Medication5",
                    "5.png"
            );

            Medication six = new Medication(
                    "Name6",
                    300,
                    "Medication6",
                    "6.png"
            );

            Medication seven = new Medication(
                    "Name7",
                    230,
                    "Medication7",
                    "7.png"
            );

            Medication eight = new Medication(
                    "Name8",
                    250,
                    "Medication8",
                    "8.png"
            );

            Medication nine = new Medication(
                    "Name9",
                    150,
                    "Medication9",
                    "9.png"
            );

            Medication ten = new Medication(
                    "Name10",
                    450,
                    "Medication10",
                    "10.png"
            );

            medicationRepository.saveAll(
                    List.of(one, medicationTwo, three, four, five, six, seven, eight, nine, ten)
            );
        } ;
    }
}
