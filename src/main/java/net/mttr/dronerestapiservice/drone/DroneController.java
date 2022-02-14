package net.mttr.dronerestapiservice.drone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/drone")
public class DroneController {
    @GetMapping
    public List<Drone> getDrones() {
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
