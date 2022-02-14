package net.mttr.dronerestapiservice.drone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneService {

    private final DroneRepository droneRepository;

    @Autowired
    public DroneService(DroneRepository droneRepository) {
        this.droneRepository = droneRepository;
    }


    public List<Drone> getDrones() {
        return droneRepository.findAll();
    }
}
