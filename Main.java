import java.util.Scanner;

public class BusReservation {
    public static void main(String[] args) {
        BusReservationSystem system = new BusReservationSystem();
        Scanner scanner = new Scanner(System.in);

        // Adding sample buses to the system
        system.addBus(new Bus(101, true, 2));
        system.addBus(new Bus(102, false, 5));

        // Menu-driven interface
        while (true) {
            System.out.println("1. Display Buses");
            System.out.println("2. Add Bus");
            System.out.println("3. Update Bus");
            System.out.println("4. Delete Bus");
            System.out.println("5. Book Ticket");
            System.out.println("6. Update Passenger");
            System.out.println("7. Delete Passenger");
            System.out.println("8. Display Passengers");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    system.displayBuses();
                    break;
                case 2:
                    System.out.print("Enter bus number: ");
                    int busNumber = scanner.nextInt();
                    System.out.print("Is AC (true/false): ");
                    boolean ac = scanner.nextBoolean();
                    System.out.print("Enter capacity: ");
                    int capacity = scanner.nextInt();
                    system.addBus(new Bus(busNumber, ac, capacity));
                    System.out.println("Bus added successfully!");
                    break;
                case 3:
                    System.out.print("Enter bus number to update: ");
                    busNumber = scanner.nextInt();
                    System.out.print("Is AC (true/false): ");
                    ac = scanner.nextBoolean();
                    System.out.print("Enter new capacity: ");
                    capacity = scanner.nextInt();
                    system.updateBus(busNumber, ac, capacity);
                    break;
                case 4:
                    System.out.print("Enter bus number to delete: ");
                    busNumber = scanner.nextInt();
                    system.deleteBus(busNumber);
                    break;
                case 5:
                    System.out.print("Enter your name: ");
                    String name = scanner.next();
                    System.out.print("Enter your age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter bus number: ");
                    busNumber = scanner.nextInt();

                    if (system.checkAvailability(busNumber)) {
                        system.addPassenger(new Passenger(name, age, busNumber));
                        System.out.println("Ticket booked successfully!");
                    } else {
                        System.out.println("Sorry, no seats available!");
                    }
                    break;
                case 6:
                    System.out.print("Enter passenger name to update: ");
                    name = scanner.next();
                    System.out.print("Enter new age: ");
                    age = scanner.nextInt();
                    System.out.print("Enter new bus number: ");
                    busNumber = scanner.nextInt();
                    system.updatePassenger(name, age, busNumber);
                    break;
                case 7:
                    System.out.print("Enter passenger name to delete: ");
                    name = scanner.next();
                    system.deletePassenger(name);
                    break;
                case 8:
                    system.displayPassengers();
                    break;
                case 9:
                    System.out.println("Thank you for using the bus reservation system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}