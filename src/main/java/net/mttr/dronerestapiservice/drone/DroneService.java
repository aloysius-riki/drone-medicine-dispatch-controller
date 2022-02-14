package net.mttr.dronerestapiservice.drone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
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

    @Transactional
    public Optional<Drone> getDroneMedicine(String serialNumber) {
        return droneRepository.findById(serialNumber);

        }

    @Transactional
    public List<Drone> getAvailableDrones() {
        return droneRepository.findByBatteryCapacityGreaterThan(25);

    }

    public void addNewDrone(Drone drone) {
        Optional<Drone> droneOptional = droneRepository
                .findDroneBySerialNumber(drone.getSerialNumber());

        if(droneOptional.isPresent()){
            throw new IllegalStateException("serial number taken");
        }
        droneRepository.save(drone);
    }

    public void deleteDrone(String serialNumber) {
        boolean exists = droneRepository.existsById(serialNumber);
        if (!exists){
            throw new IllegalStateException(
                    "drone with serial number" + serialNumber + "does not exist");
        }
        droneRepository.deleteById(serialNumber);
    }
    @Transactional
    public void updateDrone(String serialNumber,
                            String state,
                            String medication) {
        Drone drone =  droneRepository.findById(serialNumber)
                .orElseThrow(() -> new IllegalStateException(
                        "drone with serial number " + serialNumber + " does not exist"));

        if (!Objects.equals(drone.getMedication(), "Medication")) {
            drone.setMedication(medication);
        }


    }
}
