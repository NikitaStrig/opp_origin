package transport;
public class Car {
   private final String brand;
   private final String model;
   private double engineVolume;
   private String color;
   private final int year;
   private final String country;
   private String transmission;
   private final String bodyType;
   private String registrationNumber;
   private final int numberOfSeats;
   private boolean winterTires;
   private boolean summerTires;


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


   public String getBrand() {
      return brand;
   }

   public String getModel() {
      return model;
   }


   public double getEngineVolume() {
      return engineVolume;
   }

   public void setEngineVolume(double engineVolume) {
      this.engineVolume = engineVolume;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getYear() {
      return year;
   }

   public String getCountry() {
      return country;
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



   public Car(String brand, String model, double engineVolume, String color, int year, String country,
              String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
      this.brand = brand;
      this.model = model;
      this.engineVolume = engineVolume;
      this.color = color;
      this.year = year;
      this.country = country;
      this.transmission = transmission;
      this.bodyType = bodyType;
      this.registrationNumber = registrationNumber;
      this.numberOfSeats = numberOfSeats;

      if (this.engineVolume <= 0) {
         this.engineVolume = 1.5;
      }
      if (this.color == "" || this.color == null) {
         this.color = "White";
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
      return "Car{" +
              "brand='" + brand + '\'' +
              ", model='" + model + '\'' +
              ", engineVolume=" + engineVolume +
              ", color='" + color + '\'' +
              ", year=" + year +
              ", country='" + country + '\'' +
              ", transmission='" + transmission + '\'' +
              ", bodyType='" + bodyType + '\'' +
              ", registrationNumber='" + registrationNumber + '\'' +
              ", numberOfSeats=" + numberOfSeats +
              ", winterTires=" + winterTires +
              ", summerTires=" + summerTires +
              '}';
   }

}

