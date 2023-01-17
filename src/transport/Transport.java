package transport;

public class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final int year;
    private final String country;
    private double maxSpeed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Transport(String brand, String model, String color, int year, String country, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        if (this.color == "" || this.color == null) {
            this.color = "White";
        }
        this.year = year;
        this.country = country;
        this.maxSpeed = maxSpeed;
        if (this.maxSpeed == 0 || this.maxSpeed < 5) {
            this.maxSpeed = 25;
        }
    }

    @Override
    public String toString() {
        return "Transport :" + " brend ( " + brand + ") " + " model (" + model + ") " + " color (" + color + ") " +
                " year (" + year + ") " + " country (" + country + ") " + " maxspeed (" + maxSpeed + ") ";

    }
}
