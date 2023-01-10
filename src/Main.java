public class Main {
    public static void main(String[] args) {
        Car[] mass = new Car[5];
        mass[0] = new Car("Lada","Granta","1,7 л", "Yalow", 2015,"Russia");
        mass[1] = new Car("BMW","Z8","3,0 л", "Black", 2021,"Germany");
        mass[2] = new Car("Audi","A8 50 L TDI quattr","1,7 л", "Black", 2020,"Germany");
        mass[3] = new Car("Kia","Sportage 4-го поколения","2,4 л", "Red", 2018,"South Korea");
        mass[4] = new Car("Hyundai","Avante","1,6 л", "Orange", 2016,"South Korea");
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}