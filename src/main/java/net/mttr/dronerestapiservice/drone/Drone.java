package net.mttr.dronerestapiservice.drone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Drone {
    @Id
    private String serialNumber;
    private Integer weightLimit;
    private Integer batteryCapacity;
    private String model;
    private String state;
    private String medication;

    public Drone() {
    }

    public Drone(String serialNumber,
                 Integer weightLimit,
                 Integer batteryCapacity,
                 String model,
                 String state,
                 String medication) {
        this.serialNumber = serialNumber;
        this.weightLimit = weightLimit;
        this.batteryCapacity = batteryCapacity;
        this.model = model;
        this.state = state;
        this.medication = medication;
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

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
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
