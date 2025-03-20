public class Bus {
    private int busNumber;
    private boolean ac;
    private int capacity;

    // Constructor to initialize bus details
    public Bus(int busNumber, boolean ac, int capacity) {
        this.busNumber = busNumber;
        this.ac = ac;
        this.capacity = capacity;
    }

    // Getters and Setters
    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Display bus information
    public void displayBusInfo() {
        System.out.println("Bus Number: " + busNumber + ", AC: " + ac + ", Capacity: " + capacity);
    }
}