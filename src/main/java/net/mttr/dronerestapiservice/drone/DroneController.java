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

    @PostMapping
    public void registerNewDrone(@RequestBody Drone drone){
        droneService.addNewDrone(drone);
    }

    @DeleteMapping(path = "{droneSerialNumber}")
    public void deleteDrone(@PathVariable("droneSerialNumber") String serialNumber) {
        droneService.deleteDrone(serialNumber);
    }

    @PutMapping(path = "{serialNumber}")
    public void updateDrone(
            @PathVariable("serialNumber") String serialNumber,
            @RequestParam(required = false) String state,
            @RequestParam(required = false) String medication)
            {
        droneService.updateDrone(serialNumber, state, medication);
    }
}
