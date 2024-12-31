package org.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final List<Vehicle> rentedVehicles;

    public Customer(String name) {
        this.name = name;
        this.rentedVehicles = new ArrayList<>();
    }

    public void rentVehicle(Vehicle vehicle) {
        if (vehicle.isAvailableForRental()) {
            rentedVehicles.add(vehicle);
            vehicle.setAvailable(false);
            System.out.println(name + " rented " + vehicle.getModel());
        } else {
            System.out.println(vehicle.getModel() + " is not available for rental.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        if (rentedVehicles.contains(vehicle)) {
            rentedVehicles.remove(vehicle);
            vehicle.setAvailable(true);
            System.out.println(name + " returned " + vehicle.getModel());
        } else {
            System.out.println(name + " did not rent " + vehicle.getModel());
        }
    }
}