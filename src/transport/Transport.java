package transport;

 public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T draiver;
    private boolean diagnostik;



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

     public Transport(String brand, String model, double engineVolume, T draiver, boolean diagnostik) {
         this.brand = brand;
         this.model = model;
         this.engineVolume = engineVolume;
         this.draiver = draiver;
         this.diagnostik = diagnostik;
     }
     public boolean isDiagnostik(){return diagnostik;}


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

     public abstract boolean diagnostikPass() throws TransportTypeException;
    public abstract void begin();
    public abstract void finish();
    public abstract String printType();
    abstract void checkType(String type);

}





