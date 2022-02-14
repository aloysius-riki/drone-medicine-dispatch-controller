package net.mttr.dronerestapiservice.drone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DroneRepository
        extends JpaRepository<Drone, String> {

    @Query("SELECT d FROM Drone d WHERE d.serialNumber = ?1")
    Optional<Drone> findDroneBySerialNumber(String serialNumber);

    @Query("SELECT c FROM Drone c WHERE c.batteryCapacity >= 25")
    List<Drone> findByBatteryCapacityGreaterThan(Integer low);
}
