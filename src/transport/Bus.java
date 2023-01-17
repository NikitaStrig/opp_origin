package transport;

public class Bus extends Transport {
    private String numberBus;
    Transport transport;

    public String getNumberBus() {
        return numberBus;
    }

    public void setNumberBus(String numberBus) {
        this.numberBus = numberBus;
    }

    public Bus(String brand, String model, String color, int year, String country, double maxSpeed, String numberBus) {
        super(brand, model, color, year, country, maxSpeed);
        this.numberBus = numberBus;
        transport = new Transport(getBrand(),getModel(),getColor(),getYear(),getCountry(),getMaxSpeed());
    }

    @Override
    public String toString() {
        return transport + "numberBus (" + numberBus + ") ";
    }
}
