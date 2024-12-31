package org.example;

import org.example.ConcreteClasses.Car;
import org.example.ConcreteClasses.Motorcycle;
import org.example.ConcreteClasses.Truck;

public class Main {
    public static  void main(String[] args) {
        RentalAgency agency = new  RentalAgency();
        Vehicle car = new Car("C011", "Honda Civic", 70);
        Vehicle motorcycle = new Motorcycle("M001", "Royal R1", 30);
        Vehicle truck = new Truck("T001", "Tundra T-110", 90);

        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        agency.showAvailableVehicles();

        Customer customer = new Customer("Yaw Baafi");
        customer.rentVehicle(car);
        customer.rentVehicle(motorcycle);
        customer.returnVehicle(car);
        agency.showAvailableVehicles();
    }
}