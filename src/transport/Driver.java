package transport;

import java.util.Objects;

public abstract class Driver {
    private String name;
    private boolean driverLicense;
    private int expYears;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && expYears == driver.expYears && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicense, expYears);
    }

    public int getExpYears() {
        return expYears;
    }

    public void setExpYears(int expYears) {
        this.expYears = expYears;
    }

    public Driver(String name, boolean driverLicense, int expYears) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.expYears = expYears;
    }
    public abstract void start();
    public abstract void finish();
    public abstract void needOil();

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverLicense=" + driverLicense +
                ", expYears=" + expYears +
                '}';
    }
}
