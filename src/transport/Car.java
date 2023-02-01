package transport;
public class Car extends Transport<DriverB> {
   Body body;



   public Car(String brand, String model, double engineVolume, DriverB draiver, Body body, String type, Mechanic mechanic) {
      super(brand, model, engineVolume, draiver,type,mechanic);
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
   public String printType() {
      return "Данных по транспортному средству недостаточно";
   }

   @Override
   void checkType(String type) {

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
   public boolean diagnostikPass() {
     return true;
   }

   @Override
   public void maxSpeed() {
      int i;
      for (i = 120; i < 1000; i = i * 2) {
         System.out.println("Максимальная скорость" + i);
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
      if(getType() == "" || getType() == null){
      return printType();
   }
      else{return transportPrint() + " Car{" +
              "body=" + getBody() + " : " + getBody().getBodyType()+'}';
   }
   }
}
