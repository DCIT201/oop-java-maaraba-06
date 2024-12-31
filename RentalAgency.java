package org.example;

import org.example.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private final List<Vehicle> vehicles;

    public RentalAgency() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void showAvailableVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailableForRental()) {
                System.out.println(vehicle.getModel() + " is available for rental.");
            }
        }
    }
}