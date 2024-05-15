package com.pluralsight;

import java.util.Scanner;

 public class UserInterface {
     private Dealership dealership;

     public void display() {
         Scanner scanner = new Scanner(System.in);
         int choice;

         System.out.println("1. List all vehicles");
         System.out.println("2, Quit");
         System.out.println("Enter your choice");
         choice = scanner.nextInt();
     }
 }



