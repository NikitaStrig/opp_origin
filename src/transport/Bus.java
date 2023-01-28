package transport;

public class Bus extends Transport<DriverD> {
    CapacityBus capacityBus;
    String type;

    public Bus(String brand, String model, double engineVolume, DriverD draiver, CapacityBus capacityBus, String type) {
        super(brand, model, engineVolume, draiver);
        this.capacityBus = capacityBus;
        this.type = type;
        if (this.type == "Bus") {
            try {
                throw new TransportTypeException("Автобус не должен проходить диагностику");
            } catch (TransportTypeException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getType() {
        return type;
    }

    public CapacityBus getCapacityBus() {
        return capacityBus;
    }


    @Override
    String diagnostikPass() throws TransportTypeException {
        throw new TransportTypeException("не должен");
    }


    public void setType(String type) {
        this.type = type;
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
    public String printType() {
        return "Данных по транспортному средству недостаточно";
    }

    @Override
    public void maxSpeed() {
        int i;
        for (i = 120; i < 1000; i = i * 2) {
            System.out.println("Максимальная скорость" + i);
        }

    }

    @Override
    public String toString() {
        if(getType() == "" || getType() == null){
            return printType();
        }
        if (this.getCapacityBus().getMinCapacity() == 0) {
            return  transportPrint() + " Car{" +
                    "CapacityBus=" + getCapacityBus() + " : " + " Вместимость до "
                    + getCapacityBus().getMaxCapacity() + '}';

        } else {
            return  transportPrint() + " Car{" +
                    "CapacityBus=" + getCapacityBus() + " Вместимость " + getCapacityBus().getMinCapacity() + " до "
                    + getCapacityBus().getMinCapacity() + '}';
        }
    }
}
