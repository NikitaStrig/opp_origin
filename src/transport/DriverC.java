package transport;

public class DriverC extends Driver {
    public DriverC(String name, boolean driverLicense, int expYears) {
        super(name, driverLicense, expYears);
    }

    @Override
    public void start() {
        System.out.println("Водитель категории C " + getName() + " начил движение");
    }

    @Override
    public void finish() {
        System.out.println("Водитель категории C " + getName() + " закончил движение");

    }

    @Override
    public void needOil() {
        System.out.println("Водителю категории C " + getName() + " нужно заправится");

    }
}
