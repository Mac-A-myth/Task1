// House.java
public class House {
    private String address;
    private int numberOfRooms;
    private double area;

    public House(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }

    // Getters
    public String getAddress() { return address; }
    public int getNumberOfRooms() { return numberOfRooms; }
    public double getArea() { return area; }

    // Setter with condition
    public void setNumberOfRooms(int numberOfRooms) {
        if (numberOfRooms >= 1 && numberOfRooms <= 20) {
            this.numberOfRooms = numberOfRooms;
        } else {
            System.out.println("Invalid number of rooms! Must be between 1 and 20.");
        }
    }

    public void display() {
        System.out.println("Address: " + address + ", Rooms: " + numberOfRooms + ", Area: " + area + " sq.ft");
    }
}

// TestHouse.java
public class TestHouse {
    public static void main(String[] args) {
        House house = new House("12 Green Park, Delhi", 3, 1200.5);
        house.display();

        // Safe modification using setter
        house.setNumberOfRooms(5);
        house.display();

        // Invalid change blocked
        house.setNumberOfRooms(0);
    }
}
