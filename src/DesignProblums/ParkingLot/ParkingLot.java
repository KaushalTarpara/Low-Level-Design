package DesignProblums.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<CompactSpot> compactSpotList = new ArrayList<>();
    List<LargeSpot> largeSpotList = new ArrayList<>();
    List<BikeSpot> bikeSpotList = new ArrayList<>();

    int freeCompactSpots;
    int freeLargeSpots;
    int freeBikeSpots;

    public ParkingLot(int freeCompactSpots, int freeLargeSpots, int freeBikeSpots) {
        this.freeCompactSpots = freeCompactSpots;
        this.freeLargeSpots = freeLargeSpots;
        this.freeBikeSpots = freeBikeSpots;
    }

    // Park Vehicle
    public void parkVehicle(Vehicle vehicle) {

        System.out.println("Park Your Vehicle of Type : " + vehicle.getVehicleType());

        if (vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
            if (freeLargeSpots > 0)
                parkYourLargeVehicle(vehicle);
            else
                System.out.println("Sorry all Large spots are full");

        } else if (vehicle.getVehicleType().equals(VehicleType.CAR)) {
            if (freeCompactSpots > 0)
                parkYourCompactVehicle(vehicle);
            else if (freeLargeSpots > 0)
                parkYourLargeVehicle(vehicle);
            else
                System.out.println("Sorry neither Large or Compact  spots Available");

        } else if (vehicle.getVehicleType().equals(VehicleType.BIKE)) {

            if (freeBikeSpots > 0)
                parkYourBikeVehicle(vehicle);
            else if (freeCompactSpots > 0)
                parkYourCompactVehicle(vehicle);
            else if (freeLargeSpots > 0)
                parkYourLargeVehicle(vehicle);
            else
                System.out.println("Sorry neither Large or Compact or Bike spots Available");

        }
    }

    void parkYourLargeVehicle(Vehicle vehicle) {
        LargeSpot largeSpot = new LargeSpot(ParkingSpotType.LARGE);
        largeSpot.setFree(false);
        largeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(largeSpot);   // 1 : 1 mapping between vehicle and ParkingSpot

        largeSpotList.add(largeSpot);
        System.out.println("We have Successfully Parked your " + vehicle.getVehicleType() + "Vehicle .");
        freeLargeSpots--;

    }

    void parkYourCompactVehicle(Vehicle vehicle) {
        CompactSpot compactSpot = new CompactSpot(ParkingSpotType.COMPACT);
        compactSpot.setFree(false);
        compactSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(compactSpot);   // 1 : 1 mapping between vehicle and ParkingSpot

        compactSpotList.add(compactSpot);
        System.out.println("We have Successfully Parked your " + vehicle.getVehicleType() + "Vehicle .");
        freeCompactSpots--;
    }

    void parkYourBikeVehicle(Vehicle vehicle) {
        BikeSpot bikeSpot = new BikeSpot(ParkingSpotType.BIKE);
        bikeSpot.setFree(false);
        bikeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(bikeSpot);   // 1 : 1 mapping between vehicle and ParkingSpot

        bikeSpotList.add(bikeSpot);
        System.out.println("We have Successfully Parked your " + vehicle.getVehicleType() + "Vehicle .");
        freeBikeSpots--;
    }

    // Unpark Vehicle
    public void unParkVehicle(Vehicle vehicle) {
        System.out.println("Unpark Your Vehicle of Type : " + vehicle.getVehicleType());

        ParkingSpot parkingSpot = vehicle.getParkingSpot();
        parkingSpot.setFree(true);

        if (vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
            if (largeSpotList.remove(vehicle)) {
                System.out.println("We have Successfully removed your Vehicle.");
                freeLargeSpots++;
            } else
                System.out.println("You don't have your vehicle parked at this parking lot");
        } else if (vehicle.getVehicleType().equals(VehicleType.CAR)) {
            if (compactSpotList.remove(vehicle)) {
                System.out.println("We have Successfully removed your Vehicle.");
                freeCompactSpots++;
            } else
                System.out.println("You don't have your vehicle parked at this parking lot");
        } else if (vehicle.getVehicleType().equals(VehicleType.BIKE)) {
            if (bikeSpotList.remove(vehicle)) {
                System.out.println("We have Successfully removed your Vehicle.");
                freeBikeSpots++;
            } else
                System.out.println("You don't have your vehicle parked at this parking lot");
        }

    }
}
