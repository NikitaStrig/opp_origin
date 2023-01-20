package transport;

public class DriverD extends Driver{
    public DriverD(String name, boolean driverLicense, int expYears) {
        super(name, driverLicense, expYears);
    }

    @Override
    public void start() {
        System.out.println("Водитель категории B " + getName() + " начил движение");
    }

    @Override
    public void finish() {
        System.out.println("Водитель категории B " + getName() + " закончил движение");

    }

    @Override
    public void needOil() {
        System.out.println("Водителю категории B " + getName() + " нужно заправится");

    }
}
