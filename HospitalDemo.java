// Base class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass 1
class Patient extends Person {
    String disease;

    Patient(String name, int age, String disease) {
        super(name, age);
        this.disease = disease;
    }

    void displayRecord() {
        displayInfo();
        System.out.println("Disease: " + disease);
    }
}

// Subclass 2
class Doctor extends Person {
    String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void displayRecord() {
        displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Patient p = new Patient("Ravi", 40, "Flu");
        Doctor d = new Doctor("Dr. Meena", 35, "Cardiology");

        p.displayRecord();
        d.displayRecord();
    }
}
