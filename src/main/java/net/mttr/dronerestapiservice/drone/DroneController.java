package net.mttr.dronerestapiservice.drone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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


    @GetMapping(path = "serialnumber/{serialNumber}")
    public Optional<Drone> getDroneMedicine(
            @PathVariable("serialNumber") String serialNumber)
    {
        return droneService.getDroneMedicine(serialNumber);
    }

    @GetMapping(path = "available")
    public List<Drone> getAvailableDrones()
    {
        return droneService.getAvailableDrones();
    }

    @PostMapping(path = "register")
    public void registerNewDrone(@RequestBody Drone drone){
        droneService.addNewDrone(drone);
    }

    @DeleteMapping(path = "{droneSerialNumber}")
    public void deleteDrone(@PathVariable("droneSerialNumber") String serialNumber) {
        droneService.deleteDrone(serialNumber);
    }


    @PutMapping(path = "load")
    public void loadDrone(@RequestBody Drone drone)
    {
        droneService.loadDrone(drone);
    }
}
