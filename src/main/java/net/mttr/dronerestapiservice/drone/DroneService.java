package net.mttr.dronerestapiservice.drone;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneService {
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
