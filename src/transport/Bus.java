package transport;

public class Bus extends Transport {
    private String numberBus;


    public String getNumberBus() {
        return numberBus;
    }

    public void setNumberBus(String numberBus) {
        this.numberBus = numberBus;
    }

    public Bus(String brand, String model, double engineVolume, String numberBus, Transport transport) {
        super(brand, model, engineVolume);
        this.numberBus = numberBus;
    }

}


    }
}
