package transport;

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
