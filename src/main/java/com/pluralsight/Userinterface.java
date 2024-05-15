package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Userinterface {

    private static int numVehicles = 5;
    private static Scanner scanner;


    public static void main(String[] args, String[] vehichleData) {

      while (true) {

          // Display menu
          System.out.println("1. Find vehicles within price range");
          System.out.println("2. Find vehicles by make/model");
          System.out.println("3. Find by vehicles by year range");
          System.out.println("4. Find vehicles by color");
          System.out.println("5. Find vehicles by mileage range");
          System.out.println("6. Find vehicles by type(car, truck, SUV,van");
          System.out.println("7. List ALL vehicles");
          System.out.println("8. Add a vehicle");
          System.out.println("9. Remove a vehicle");
          System.out.println("99. Quit");

          int command = scanner.nextInt();
          scanner.nextLine();
      }
     // use a switch statement
        switch (command) {
            case 1:
                findVehiclesWithinPriceRange(scanner);
                break;
            case 2:
                findVehiclesByMakeModel(scanner);
                break;
            case 3:
                findVehiclesByYearRange(scanner);
                break;
            case 4:
                findVehiclesByColor(scanner);
                break;
            case 5:
                findVehiclesByMileageRange(scanner);
                break;
            case 6:
                findVehiclesByType(scanner);
                break;
            case 7:
                listAllVehicles(scanner);
                break;
            case 8:
                AddAVehicle(scanner);
                break;
            case 9:
                RemoveAVehicle(scanner);
                break;
            case 99:
                Quit(scanner);
                break;
        }

         public class getDealership method() {
          return Userinterface;

        @Override
            public String toString() {
                return "Make: " make + ",Model : + model + ", Type:" + type + ", Color: " + color " + Year:
                + year + ", Mileage: " + mileage + ", Price: $" + price;
            }

            public static void main(String[] args){
                List<String> vehicles = List.of()
                "10234|2015|Toyota|Camry|sedan|silver|12000|15995.0"
                "10567|2018|honda|Civic|sedan|black|8000|18995.0",
                        "10987|2017|Ford|Escape|SUV|white|25000|20995.0",
                        "11000|2018|Chevrolet|Malibu|sedan|red|12000|16995.0"
                "1111|2019|toyota|RAV4|SUV|blue|10000|27995.0,"


            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }


