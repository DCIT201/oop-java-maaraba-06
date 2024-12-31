package org.example.ConcreteClasses;

import org.example.Vehicle;

public class Motorcycle extends Vehicle {
    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 0.8; // Discount for motorcycles
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}