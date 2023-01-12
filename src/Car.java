public class Car {
   private String brand;
   private String  model;
   private double engineVolume;
   private String  color;
   private  int year;
   private String country;

   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
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

   public void setYear(int year) {
      this.year = year;
   }

   public String getCountry() {
      return country;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public Car(String brand, String model, double engineVolume, String color, int year, String country) {
      this.brand = brand;
      this.model = model;
      this.engineVolume = engineVolume;
      this.color = color;
      this.year = year;
      this.country = country;
      if (this.model == "" || this.model == null) {
         this.model = "default";
      }
      if (this.brand == "" || this.brand == null) {
         this.brand = "default";
      }
      if (this.country == "" || this.country == null) {
         this.country = "default";
      }
      if (this.engineVolume <= 0) {
         this.engineVolume = 1.5;
      }
      if (this.color == "" || this.color == null) {
         this.color = "White";
      }
      if (this.year <= 0) {
         this.year = 2000;
      }

   }



  // Если год производства ≤0, то значение по умолчанию — 2000.

   @Override
   public String toString() {
      return "Car{" +
              "brand='" + brand + '\'' +
              ", model='" + model + '\'' +
              ", engineVolume=" + engineVolume + " л" +
              ", color='" + color + '\'' +
              ", year=" + year +
              ", country='" + country + '\'' +
              '}';
   }
}
