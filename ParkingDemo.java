class Vehicle {
    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    void displayDetails() {
        System.out.println("Vehicle: " + vehicleNumber + ", Owner: " + ownerName);
    }
}

// Subclass 1: Car
class Car extends Vehicle {
    int parkingSlot;

    Car(String vehicleNumber, String ownerName, int parkingSlot) {
        super(vehicleNumber, ownerName);
        this.parkingSlot = parkingSlot;
    }

    void displayParkingInfo() {
        System.out.println("=== Car Parking Info ===");
        displayDetails();
        System.out.println("Parking Slot: " + parkingSlot);
        System.out.println();
    }
}

// Subclass 2: Bike
class Bike extends Vehicle {
    String parkingZone;

    Bike(String vehicleNumber, String ownerName, String parkingZone) {
        super(vehicleNumber, ownerName);
        this.parkingZone = parkingZone;
    }

    void displayParkingInfo() {
        System.out.println("=== Bike Parking Info ===");
        displayDetails();
        System.out.println("Parking Zone: " + parkingZone);
        System.out.println();
    }
}

// Main class
public class ParkingDemo {
    public static void main(String[] args) {
        Car car = new Car("KA09AB1234", "Amit", 12);
        Bike bike = new Bike("KA05XY7890", "Ravi", "Zone B");

        car.displayParkingInfo();
        bike.displayParkingInfo();
    }
}
