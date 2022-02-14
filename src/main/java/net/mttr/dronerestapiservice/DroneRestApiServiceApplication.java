package net.mttr.dronerestapiservice;

import org.springframework.boot.SpringApplication;
import net.mttr.dronerestapiservice.drone.Drone;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DroneRestApiServiceApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DroneRestApiServiceApplication.class, args);
	}

	@GetMapping
	public List<Drone> hello() {
		return List.of(
			new Drone(
				"SerialNumber",
				500,
				45,
				"Model",
				"State"
		)
		);
	}
}
