package transport;
public class Car {
   final String brand;
   final String  model;
   private double engineVolume;
   private String  color;
   final   int year;
   final String country;
   private String transmission;
   final String bodyType;
   private String registrationNumber;
   final int numberOfSeats;
   private int mSignTires;
   private boolean signTires;


   public class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public boolean isRemoteEngineStart() {
           return remoteEngineStart;
        }

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
           this.remoteEngineStart = remoteEngineStart;
           this.keylessAccess = keylessAccess;
        }


        public void setRemoteEngineStart(boolean remoteEngineStart) {
           this.remoteEngineStart = remoteEngineStart;
        }

        public boolean isKeylessAccess() {
           return keylessAccess;
        }

        public void setKeylessAccess(boolean keylessAccess) {
           this.remoteEngineStart = keylessAccess;
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

   public boolean getSignTires() {
      return signTires;
   }

   public Car(String brand, String model, double engineVolume, String color, int year, String country,
              String transmission, String bodyType, String registrationNumber, int numberOfSeats, int mSignTires) {
      this.brand = brand;
      this.model = model;
      this.engineVolume = engineVolume;
      this.color = color;
      this.year = year;
      this.country = country;
      this.transmission = transmission;
      this.bodyType = bodyType;
      this.registrationNumber = registrationNumber;
      this.numberOfSeats = numberOfSeats ;
      this.mSignTires = mSignTires;

      if (this.engineVolume <= 0) {
         this.engineVolume = 1.5;
      }
      if (this.color == "" || this.color == null) {
         this.color = "White";
      }
      if (this.transmission == "" || this.transmission == null){
         this.transmission = "Auto";
      }
      if (this.registrationNumber == "" || this.registrationNumber == null){
         this.registrationNumber = "A000AA000";
      }
      if (this.mSignTires >= 3 && this.mSignTires <= 10){
         this.signTires = false;
      }
      else {this.signTires = true;}
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
              ", signTires=" + signTires +
              '}';
   }
}
