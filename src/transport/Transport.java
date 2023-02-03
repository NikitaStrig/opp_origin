package transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport <T extends Driver, M extends Mechanic> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T draiver;
    private String type;
    private M mechanic;
    List<transport.Mechanic> mechanicList = new ArrayList<>();


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

    public Mechanic getMechanic() {
        return mechanic;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public Transport(String brand, String model, double engineVolume, T draiver, String type,M mechanic) {
         this.brand = brand;
         this.model = model;
         this.engineVolume = engineVolume;
         this.draiver = draiver;
         this.type = type;
         this.mechanic = mechanic;



     }

     public String getType() {
         return type;
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
                ", type='" + type + '\'' +
                ", mechanic=" + mechanic +
                ", mechanicList=" + mechanicList +
                '}';
    }


     public abstract boolean diagnostikPass() throws TransportTypeException;
    public abstract void begin();
    public abstract void finish();
    public abstract String printType();
    abstract void checkType(String type);




}





