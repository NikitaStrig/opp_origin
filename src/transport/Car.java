package transport;
public class Car extends Transport<DriverB> {
   Body body;

   public Car(String brand, String model, double engineVolume, DriverB draiver, Body body) {
      super(brand, model, engineVolume, draiver);
      this.body = body;


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
   SEDAN("Седан"),
   HATSHBACK("Хачбек"),
   COUPE("Купе"),
   UNIVERSAL("Универсал"),
   SUV("СУВ"),
   CROSSOVER("Кроссовер"),
   PICKUP("Пикап"),
   VAN("ВАН"),
   MINIVAN("Минивен");

   private String BodyType;


   Body(String bodyType) {
      this.BodyType = bodyType;
   }

   // Создаем геттер для поля
   public String getBodyType() {
      return BodyType;
   }

}

   public Body getBody() {
      return body;
   }

   public void setBody(Body body) {
      this.body = body;
   }

   @Override
   public String toString() {
      return "Transport{" +
              "brand='" + getBrand() + '\'' +
              ", model='" + getModel() + '\'' +
              ", engineVolume=" + getEngineVolume() +
              ", draiver=" + getDraiver() +
              '}' + " Car{" +
              "body=" + getBody() + " : " + getBody().getBodyType()+'}';
   }

   }




