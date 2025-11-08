class Booking {
    String passengerName;

    Booking(String passengerName) {
        this.passengerName = passengerName;
    }

    void bookTicket() {
        System.out.println("Booking for passenger: " + passengerName);
    }
}

class FlightBooking extends Booking {
    FlightBooking(String name) { super(name); }

    void bookTicket() {
        System.out.println("Flight booked for: " + passengerName);
    }
}

class TrainBooking extends Booking {
    TrainBooking(String name) { super(name); }

    void bookTicket() {
        System.out.println("Train booked for: " + passengerName);
    }
}

class BusBooking extends Booking {
    BusBooking(String name) { super(name); }

    void bookTicket() {
        System.out.println("Bus booked for: " + passengerName);
    }
}

public class BookingDemo {
    public static void main(String[] args) {
        Booking b1 = new FlightBooking("Rahul");
        Booking b2 = new TrainBooking("Priya");
        Booking b3 = new BusBooking("Kiran");

        b1.bookTicket();
        b2.bookTicket();
        b3.bookTicket();
    }
}
