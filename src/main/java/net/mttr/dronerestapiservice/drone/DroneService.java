package net.mttr.dronerestapiservice.drone;

import java.util.List;

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
