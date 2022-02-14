package net.mttr.dronerestapiservice.drone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneRepository
        extends JpaRepository<Drone, String> {
}
