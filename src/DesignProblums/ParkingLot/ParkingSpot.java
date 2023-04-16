package DesignProblums.ParkingLot;

public class ParkingSpot {
    private ParkingSpotType type;
    private  Vehicle vehicle;
    private boolean free;

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }

    // Getters and Setters
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }


    public ParkingSpotType getType() {
        return type;
    }

    public void setType(ParkingSpotType type) {
        this.type = type;
    }
}
