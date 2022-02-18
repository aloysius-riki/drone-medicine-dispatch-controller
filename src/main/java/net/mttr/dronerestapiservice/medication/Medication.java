package net.mttr.dronerestapiservice.medication;

import net.mttr.dronerestapiservice.drone.Drone;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Medication {
    @Id
    private String name;
    private Integer weight;
    private String code;
    private String image;
    @ManyToMany(mappedBy = "medication", fetch = FetchType.LAZY)
    private Set<Drone> drone = new HashSet<>();

    public Medication() {
    }

    public Medication(String name, Integer weight, String code, String image) {
        this.name = name;
        this.weight = weight;
        this.code = code;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", code='" + code + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

