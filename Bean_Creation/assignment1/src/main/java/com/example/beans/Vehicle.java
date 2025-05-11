package com.example.beans;

import com.example.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="vehicleBean")
public class Vehicle {
    private String name;
    private final VehicleServices vehicleservices;

    @Autowired
    public Vehicle(VehicleServices vehicleservices) {
        this.vehicleservices = vehicleservices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleservices;
    }

    @Override
    public String toString() {
        return "Vehicle name is " + name;
    }
}
