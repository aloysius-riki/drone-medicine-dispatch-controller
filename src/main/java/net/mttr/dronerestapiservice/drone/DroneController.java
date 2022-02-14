package net.mttr.dronerestapiservice.drone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/drone")
public class DroneController {

    private final DroneService droneService;

    @Autowired
    public DroneController(DroneService droneService) {
        this.droneService = droneService;
    }

    @GetMapping
    public List<Drone> getDrones() {
        return droneService.getDrones();
    }

    @PostMapping
    public void registerNewDrone(@RequestBody Drone drone){
        droneService.addNewDrone(drone);
    }

    @DeleteMapping(path = "{droneSerialNumber}")
    public void deleteDrone(@PathVariable("droneSerialNumber") String serialNumber) {
        droneService.deleteDrone(serialNumber);
    }
}
