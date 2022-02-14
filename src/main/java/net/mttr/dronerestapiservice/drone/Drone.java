package net.mttr.dronerestapiservice.drone;

public class Drone {
    private String serialNumber;
    private Integer weightLimit;
    private Integer batteryCapacity;
    private String model;
    private String state;



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

    @Override
    public String toString() {
        return "Drone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", weightLimit=" + weightLimit +
                ", batteryCapacity=" + batteryCapacity +
                ", model='" + model + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
