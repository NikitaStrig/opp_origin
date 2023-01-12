public class Main {
    public static void main(String[] args) {
        Car[] mass = new Car[6];
        mass[0] = new Car("Lada","Granta",1.7, "Yalow", 2015,"Russia");
        mass[1] = new Car("BMW","Z8",3.0, "Black", 2021,"Germany");
        mass[2] = new Car("Audi","A8 50 L TDI quattr",1.7, "Black", 2020,"Germany");
        mass[3] = new Car("Kia","Sportage 4-го поколения",2.4, "Red", 2018,"South Korea");
        mass[4] = new Car("Hyundai","Avante",1.6, "Orange", 2016,"South Korea");
        mass[5] = new Car("","",0, null, 0,null);

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}