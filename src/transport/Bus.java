package transport;

public class Bus extends Transport<DriverD> {
    CapacityBus capacityBus;

    public Bus(String brand, String model, double engineVolume, DriverD draiver, CapacityBus capacityBus) {
        super(brand, model, engineVolume, draiver);
        this.capacityBus = capacityBus;
    }


    @Override
    public void begin() {
        System.out.println("Автобус " + getModel() + " начил движение ");
    }

    @Override
    public void finish() {
        System.out.println("Автобус" + getModel() + " закончил движение ");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп автомобиля ");
    }

    @Override
    public void beast() {
        int i;
        for (i = 0; i < 4; i++) {
            System.out.println("Лутший круз" + i);
        }

    }

    @Override
    public void maxSpeed() {
        int i;
        for (i = 120; i < 1000; i = i * 2) {
            System.out.println("Максимальная скорость" + i);
        }

    }

    public CapacityBus getCapacityBus() {
        return capacityBus;
    }

    public enum CapacityBus {
        especiallySmall(0, 10),
        small(0, 25),
        average(40, 50),
        big(60, 80),
        extraLarge(100, 120);
        private int minCapacity, maxCapacity;


        CapacityBus(int minCapacity, int maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        public int getMinCapacity() {
            return minCapacity;
        }

        public int getMaxCapacity() {
            return maxCapacity;
        }

        public void setMinCapacity(int minCapacity) {
            this.minCapacity = minCapacity;
        }

        public void setMaxCapacity(int maxCapacity) {
            this.maxCapacity = maxCapacity;
        }
    }


    @Override
    public String toString() {
        if (this.getCapacityBus().getMinCapacity() == 0) {
            return "Transport{" +
                    "brand='" + getBrand() + '\'' +
                    ", model='" + getModel() + '\'' +
                    ", engineVolume=" + getEngineVolume() +
                    ", draiver=" + getDraiver() +
                    '}' + " Car{" +
                    "CapacityBus=" + getCapacityBus() + " : " + " Вместимость до "
                    + getCapacityBus().getMaxCapacity() + '}';

        } else {
            return "Transport{" +
                    "brand='" + getBrand() + '\'' +
                    ", model='" + getModel() + '\'' +
                    ", engineVolume=" + getEngineVolume() +
                    ", draiver=" + getDraiver() +
                    '}' + " Car{" +
                    "CapacityBus=" + getCapacityBus() + " Вместимость " + getCapacityBus().getMinCapacity() + " до "
                    + getCapacityBus().getMinCapacity() + '}';
        }
    }
}
