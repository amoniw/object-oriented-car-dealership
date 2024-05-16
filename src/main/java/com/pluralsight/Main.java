package com.pluralsight;

public class Main {
public static  void main(String[] args) {

  Vehicle vehicle1 = new Vehicle("My Car","2020-06-02"
  Vehicle vehicle2 = new Vehicle("Travel Car", "2018-05-01"

  assets.add(house1);
  assets.add(house2);
  assets.add(vehicle1);
  assets.add(vehicle2);

  for (Asset asset : assets) {
    System.out.println("Description: " + asset.getDescription());
    System.out.println("Date Acquired:" + asset.getDateAcquired());
    System.out.println("Original Cost: $" + asset.getOriginalCost);
    if (asset instanceof House) {
      House house = (House) asset;
      System.out.println("Address: " + house, getAddress);
    } else if (asset instanceof Vehicle)  {
      Vehicle vehicle = (Vehicle) asset;
      System.out.println("Make/Model: " + vehicle.getMakeModel());
      System.out.println("Year: " + vehicle.getYear());

    }
  }

}

}
