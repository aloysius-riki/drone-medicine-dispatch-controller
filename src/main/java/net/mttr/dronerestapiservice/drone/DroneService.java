package net.mttr.dronerestapiservice.drone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void addNewDrone(Drone drone) {
        Optional<Drone> droneOptional = droneRepository
                .findDroneBySerialNumber(drone.getSerialNumber());

        if(droneOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        droneRepository.save(drone);
    }
}
