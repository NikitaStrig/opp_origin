package transport;

abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T draiver;



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T getDraiver() {
        return draiver;
    }

    public void setDraiver(T draiver) {
        this.draiver = draiver;
    }

    public Transport(String brand, String model, double engineVolume, T draiver) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        setDraiver(draiver);
    }

    public String transportPrint() {
        return "Transport{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", draiver=" + getDraiver() +
                '}';
    }
    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", draiver=" + draiver +
                '}';
    }

    public abstract void begin();
    public abstract void finish();
    public abstract String printType();





}





