// Smartphone.java
public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

    public Smartphone(String brand, String model, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        setStorageCapacity(storageCapacity); // use setter to apply validation
    }

    // Getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getStorageCapacity() { return storageCapacity; }

    // Setter with validation
    public void setStorageCapacity(int storageCapacity) {
        if (storageCapacity > 0 && storageCapacity <= 1024) {
            this.storageCapacity = storageCapacity;
        } else {
            System.out.println("Invalid storage size! Must be between 1 and 1024 GB.");
        }
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Storage: " + storageCapacity + "GB");
    }
}

// TestSmartphone.java
public class TestSmartphone {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", "Galaxy S23", 128);
        phone.display();

        // Try to modify using setter (safe way)
        phone.setStorageCapacity(512);
        phone.display();

        // Try invalid value (class prevents incorrect change)
        phone.setStorageCapacity(-50);
        phone.display();
    }
}
