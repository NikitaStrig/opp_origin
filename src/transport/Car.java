package transport;
public class Car extends Transport {
   private double engineVolume;
   private String transmission;
   private final String bodyType;
   private String registrationNumber;
   private final int numberOfSeats;
   private boolean winterTires;
   private boolean summerTires;
   Key key;
   Transport transport;


   public class Key {
      private boolean remoteEngineStart;
      private boolean keylessAccess;



      public Key(boolean remoteEngineStart, boolean keylessAccess) {
         this.remoteEngineStart = remoteEngineStart;
         this.keylessAccess = keylessAccess;
      }

      public boolean isRemoteEngineStart() {
         return remoteEngineStart;
      }

      public void setRemoteEngineStart(boolean remoteEngineStart) {
         this.remoteEngineStart = remoteEngineStart;
      }

      public boolean isKeylessAccess() {
         return keylessAccess;
      }

      public void setKeylessAccess(boolean keylessAccess) {
         this.keylessAccess = keylessAccess;
      }

      @Override
      public String toString() {
         return "Key{" +
                 "remoteEngineStart=" + remoteEngineStart +
                 ", keylessAccess=" + keylessAccess +
                 '}';
      }
   }

   public double getEngineVolume() {
      return engineVolume;
   }

   public void setEngineVolume(double engineVolume) {
      this.engineVolume = engineVolume;
   }

   public void setWinterTires(boolean winterTires) {
      this.winterTires = winterTires;
   }

   public void setSummerTires(boolean summerTires) {
      this.summerTires = summerTires;
   }

   public String getTransmission() {
      return transmission;
   }

   public void setTransmission(String transmission) {
      this.transmission = transmission;
   }

   public String getBodyType() {
      return bodyType;
   }

   public String getRegistrationNumber() {
      return registrationNumber;
   }

   public void setRegistrationNumber(String registrationNumber) {
      this.registrationNumber = registrationNumber;
   }

   public int getNumberOfSeats() {
      return numberOfSeats;
   }


   public Car(String brand, String model, String color, int year, String country, double maxSpeed,  double engineVolume,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
      super(brand, model, color, year, country, maxSpeed);
      transport = new Transport(getBrand(),getModel(),getColor(),getYear(),getCountry(),getMaxSpeed());
      this.engineVolume = engineVolume;
      this.transmission = transmission;
      this.bodyType = bodyType;
      this.registrationNumber = registrationNumber;
      this.numberOfSeats = numberOfSeats;
      key = new Key(false,false);
      if (this.engineVolume <= 0) {
         this.engineVolume = 1.5;
      }
      if (this.transmission == "" || this.transmission == null) {
         this.transmission = "Auto";
      }
      if (this.registrationNumber == "" || this.registrationNumber == null) {
         this.registrationNumber = "A000AA000";
      }

   }

   @Override
   public String toString() {
      return transport +
              "Car : "+ "engineVolume (" + engineVolume + ") " + " transmission= (" + transmission + ") " +
              " bodyType (" + bodyType + ") " + " registrationNumber (" + registrationNumber + ") " +
              " numberOfSeats (" + numberOfSeats + ") " + " winterTires (" + winterTires + ") " +
              " summerTires (" + summerTires + ") " +
              " key " + key + ") ";
   }
}




