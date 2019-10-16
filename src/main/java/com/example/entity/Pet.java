package com.example.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "pet")
public class Pet {

    private String petName; //松散语法等价于pet-name
    private String strain;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petName='" + petName + '\'' +
                ", strain='" + strain + '\'' +
                '}';
    }

    public Pet(String petName, String strain) {
        this.petName = petName;
        this.strain = strain;
    }

    public Pet() {
    }
}
