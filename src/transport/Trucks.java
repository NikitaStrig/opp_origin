package transport;

public class Trucks extends Transport{
    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
    }
