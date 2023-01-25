package transport;
public class Car extends Transport<DriverB> {
   Body body;
   String bbody;

   public Car(String brand, String model, double engineVolume, DriverB draiver, Body body) {
      super(brand, model, engineVolume, draiver);
      this.body = body;

      switch(this.body){
         case SEDAN:
            bbody = "Седан";
            break;
         case HATSHBACK:
            bbody = "Хачбек";
            break;
         case COUPE:
            bbody = "Купе";
            break;
         case UNIVERSAL:
            bbody = "Универсал";
            break;
         case SUV:
            bbody = "СУВ";
            break;
         case CROSSOVER:
            bbody = "Кросовер";
            break;
         case PICKUP:
            bbody = "Пикап";
            break;
      }

   }


   @Override
   public void begin() {
      System.out.println("Автомобиль " + getModel() + " начил движение ");
   }

   @Override
   public void finish() {
      System.out.println("Автомобиль" + getModel() + " закончил движение ");

   }

   @Override
   public void pitStop() {
      System.out.println("Пит стоп автомобиля ");
   }

   @Override
   public void beast() {
      int i;
      for (i = 0; i < 4; i++) {
         System.out.println("Лутший круг" + i);
      }

   }

   @Override
   public void maxSpeed() {
      int i;
      for (i = 120; i < 1000; i = i * 2) {
         System.out.println("Максимальная скорость" + i);
      }

   }
public enum Body{
   SEDAN,
   HATSHBACK,
   COUPE,
   UNIVERSAL,
   SUV,
   CROSSOVER,
   PICKUP,
   VAN,
   MINIVAN;

}

   public Body getBody() {
      return body;
   }

   @Override
   public String toString() {
      return "Transport{" +
              "brand='" + getBrand() + '\'' +
              ", model='" + getModel() + '\'' +
              ", engineVolume=" + getEngineVolume() +
              ", draiver=" + getDraiver() +
              '}' + " Car{" +
              "body=" + bbody +
              '}';
   }

   }




