package com.SpringRepository1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@Entity
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private String serialNumber;
    @Column
    private String currentPrice;

    public Car(Long id, String modelName, String serialNumber, String currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }
}


