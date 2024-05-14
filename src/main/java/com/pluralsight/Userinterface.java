package com.pluralsight;

import java.util.ArrayList;

public class Userinterface {

 private ArrayList<Userinterface> dealership;

 public Userinterface(double price, String Model, int YearRequest, String ColorRequest, int Mileage, String VehicleType, String AllVehicles)  {

 private void displayDealership(Dealership dealership) {
   System.out.println("Dealership inventory:");
   Vehicle[] vehicles = dealership.getvehicles();
   for (Vehicle vehicle : vehicle) {
       System.out.println("Vehicle price: " + vehicle.getPrice());
       System.out.println("Model:" + vehicle.getModel());
       System.out.println("Year:" + vehicle.getYear());
       System.out.println("Color:" + vehicle.getColor());
       System.out.println("Mileage" + vehicle.getMileage());
       System.out.println("Vehicle type" + vehicle.getType());

       DealershipsFileManager dealershipsFileManager = new DealershipsFileManager();

       public class Dealership {
           private String name;
           private Vehicle[] vehicles;

           public Dealership(String name) {
               this.name = name;
               this.vehicles = new Vehicle[5];
               // 5 max of vehicles
           }
       }
   }
   private void displayVehicles() {


         }


    public Userinterface() {
    }