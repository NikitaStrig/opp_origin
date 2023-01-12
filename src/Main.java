public class Main {
    public static void main(String[] args) {
        transport.Car[] mass = new transport.Car[6];
        mass[0] = new transport.Car("Lada","Granta",1.7, "Yalow", 2015,"Russia", "Meh", "Sedan", "C337PV777", 5,10);
        mass[1] = new transport.Car("BMW","Z8",3.0, "Black", 2021,"Germany", "Meh", "Sedan", "C337PV777", 5, 4);
        mass[2] = new transport.Car("Audi","A8 50 L TDI quattr",1.7, "Black", 2020,"Germany", "Meh", "Sedan", "C337PV777", 5, 11);
        mass[3] = new transport.Car("Kia","Sportage 4-го поколения",2.4, "Red", 2018,"South Korea", "Meh", "Sedan", "C337PV777", 5, 1);
        mass[4] = new transport.Car("Hyundai","Avante",1.6, "Orange", 2016,"South Korea", "Meh", "Sedan", "C337PV777", 5, 5);
        mass[5] = new transport.Car("","",0, null, 0,null, "Meh", "Sedan", "C337PV777", 5, 3);

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}