package net.mttr.dronerestapiservice.drone;

import javax.persistence.*;

import net.mttr.dronerestapiservice.medication.Medication;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Drone {
    @Id
    private String serialNumber;
    private Integer weightLimit;
    private Integer batteryCapacity;
    private String model;
    private String state;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "drone_medication",
            joinColumns = {
                    @JoinColumn(name = "droneSerialNumber", referencedColumnName = "serialNumber",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "medicationName", referencedColumnName = "name",
                            nullable = false, updatable = false)})
    private Set<Medication> medication = new HashSet<>();


    public Drone() {
    }

    public Drone(String serialNumber,
                 Integer weightLimit,
                 Integer batteryCapacity,
                 String model,
                 String state) {
        this.serialNumber = serialNumber;
        this.weightLimit = weightLimit;
        this.batteryCapacity = batteryCapacity;
        this.model = model;
        this.state = state;
    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(Integer weightLimit) {
        this.weightLimit = weightLimit;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Set<Medication> getMedication() {
        return medication;
    }

    public void setMedication(Set<Medication> medication) {
        this.medication = medication;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", weightLimit=" + weightLimit +
                ", batteryCapacity=" + batteryCapacity +
                ", model='" + model + '\'' +
                ", state='" + state + '\'' +
                ", medication='" + medication + '\'' +
                '}';
    }
}
