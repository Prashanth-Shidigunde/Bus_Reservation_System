public class Passenger {
    private String name;
    private int age;
    private int busNumber;

    // Constructor to initialize passenger details
    public Passenger(String name, int age, int busNumber) {
        this.name = name;
        this.age = age;
        this.busNumber = busNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }
}