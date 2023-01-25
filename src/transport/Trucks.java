package transport;

public class Trucks extends Transport<DriverC>{
    LoadCapacity loadCapacity;
    public Trucks(String brand, String model, double engineVolume, DriverC draiver, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, draiver);
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
   public enum LoadCapacity{
        N1(0,3.5),
        N2(3.5,12),
        N3(12,999);
        private double LoadUp, LoadLowe;


        LoadCapacity(double loadLowe, double loadUp) {
            this.LoadUp = loadUp;
            this.LoadLowe = loadLowe;


        }

        public double getLoadUp() {
            return LoadUp;

        }
        public double getLoadLowe() {
            return LoadLowe;
        }
    }

    @Override
    public String toString() {
        if (this.loadCapacity.getLoadLowe() == 0) {
            return "Transport{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", draiver=" + getDraiver() +
                '}' + " Car{" +
                "loadCapacity=" + getLoadCapacity() + " : " + " Грузоподъемности  до "
                + getLoadCapacity().getLoadUp() + '}';

        }
        if (this.loadCapacity.getLoadUp() == 999) {
            return "Transport{" +
                    "brand='" + getBrand() + '\'' +
                    ", model='" + getModel() + '\'' +
                    ", engineVolume=" + getEngineVolume() +
                    ", draiver=" + getDraiver() +
                    '}' + " Car{" +
                    "loadCapacity=" + getLoadCapacity() + " : " + " Грузоподъемности  свыше "
                    + getLoadCapacity().getLoadLowe() + '}';

        } else {return "Transport{" +
        "brand='" + getBrand() + '\'' +
        ", model='" + getModel() + '\'' +
        ", engineVolume=" + getEngineVolume() +
        ", draiver=" + getDraiver() +
                  '}' + " Car{" +
                   "loadCapacity=" + getLoadCapacity() + " : " + getLoadCapacity().getLoadLowe() + " до " + getLoadCapacity().getLoadUp() + '}';
        }

}
}



//return "Transport{" +
//        "brand='" + getBrand() + '\'' +
//        ", model='" + getModel() + '\'' +
//        ", engineVolume=" + getEngineVolume() +
//        ", draiver=" + getDraiver() +
 //       '}' + " Car{" +
 //       "loadCapacity=" + getLoadCapacity() + " : " + getLoadCapacity().LoadLowe + " до " + getLoadCapacity().LoadUp + '}';
 //       }