package transport;

public class Trucks extends Transport<DriverC,Mechanic> {
    LoadCapacity loadCapacity;


    public Trucks(String brand, String model, double engineVolume, DriverC draiver, LoadCapacity loadCapacity, String type,
    Mechanic mechanic) {
        super(brand, model, engineVolume, draiver,type,mechanic);
        this.loadCapacity = loadCapacity;

    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }


    @Override
    public void begin() {
        System.out.println("Тегач " + getModel() + " начил движение ");
    }

    @Override
    public void finish() {
        System.out.println("Тегач" + getModel() + " закончил движение ");

    }
    @Override
    public boolean diagnostikPass() {
   return true;
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
    void checkType(String type) {

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
            if (getType() == "" || getType() == null) {
                return printType();
            }
            if (this.loadCapacity.getLoadLowe() == 0) {
                return  transportPrint() + " Car{" +
                        "loadCapacity=" + getLoadCapacity() + " : " + " Грузоподъемности  до "
                        + getLoadCapacity().getLoadUp() + '}';
            }
            if (this.loadCapacity.getLoadUp() == 999) {
                return transportPrint() + " Car{" +
                        "loadCapacity=" + getLoadCapacity() + " : " + " Грузоподъемности  свыше "
                        + getLoadCapacity().getLoadLowe() + '}';
            } else {
                return transportPrint() + " Car{" +
                        "loadCapacity=" + getLoadCapacity() + " : " + getLoadCapacity().getLoadLowe() + " до " + getLoadCapacity().getLoadUp() + '}';
            }
        }
        }

