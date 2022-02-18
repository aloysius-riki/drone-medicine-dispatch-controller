package net.mttr.dronerestapiservice.medication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface MedicationRepository
        extends JpaRepository<Medication, String> {

    @Query("SELECT d FROM Medication d WHERE d.name = ?1")
    Optional<Medication> findMedicationByName(String name);


}
