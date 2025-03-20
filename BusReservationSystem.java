import java.util.ArrayList;
import java.util.Iterator;

public class BusReservationSystem {
    private ArrayList<Bus> buses = new ArrayList<>();
    private ArrayList<Passenger> passengers = new ArrayList<>();

    // Add a new bus to the system
    public void addBus(Bus bus) {
        buses.add(bus);
    }

    // Update bus details
    public void updateBus(int busNumber, boolean ac, int capacity) {
        for (Bus bus : buses) {
            if (bus.getBusNumber() == busNumber) {
                bus.setAc(ac);
                bus.setCapacity(capacity);
                System.out.println("Bus details updated successfully!");
                return;
            }
        }
        System.out.println("Bus not found!");
    }

    // Delete a bus from the system
    public void deleteBus(int busNumber) {
        Iterator<Bus> iterator = buses.iterator();
        while (iterator.hasNext()) {
            Bus bus = iterator.next();
            if (bus.getBusNumber() == busNumber) {
                iterator.remove();
                System.out.println("Bus deleted successfully!");
                return;
            }
        }
        System.out.println("Bus not found!");
    }

    // Add a new passenger and update bus capacity
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
        for (Bus bus : buses) {
            if (bus.getBusNumber() == passenger.getBusNumber()) {
                bus.setCapacity(bus.getCapacity() - 1);
            }
        }
    }

    // Update passenger details
    public void updatePassenger(String name, int age, int busNumber) {
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                passenger.setAge(age);
                passenger.setBusNumber(busNumber);
                System.out.println("Passenger details updated successfully!");
                return;
            }
        }
        System.out.println("Passenger not found!");
    }

    // Delete a passenger from the system
    public void deletePassenger(String name) {
        Iterator<Passenger> iterator = passengers.iterator();
        while (iterator.hasNext()) {
            Passenger passenger = iterator.next();
            if (passenger.getName().equals(name)) {
                iterator.remove();
                System.out.println("Passenger deleted successfully!");
                return;
            }
        }
        System.out.println("Passenger not found!");
    }

    // Display all available buses
    public void displayBuses() {
        for (Bus bus : buses) {
            bus.displayBusInfo();
        }
    }

    // Display all passengers
    public void displayPassengers() {
        for (Passenger passenger : passengers) {
            System.out.println("Name: " + passenger.getName() + ", Age: " + passenger.getAge() + ", Bus Number: " + passenger.getBusNumber());
        }
    }

    // Check if a bus has available seats
    public boolean checkAvailability(int busNumber) {
        for (Bus bus : buses) {
            if (bus.getBusNumber() == busNumber && bus.getCapacity() > 0) {
                return true;
            }
        }
        return false;
    }
}