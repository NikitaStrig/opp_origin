import transport.Car;

public class Main {
    public static void main(String[] args) {
        transport.Car[] mass = new transport.Car[6];
        int m = 8;
        mass[0] = new transport.Car("Lada", "Granta", 1.7, "Yalow", 2015, "Russia", "Meh", "Sedan", "C447PV777", 5);
        mass[1] = new transport.Car("BMW", "Z8", 3.0, "Black", 2021, "Germany", "Meh", "Sedan", "C227PV777", 5);
        mass[2] = new transport.Car("Audi", "A8 50 L TDI quattr", 1.7, "Black", 2020, "Germany", "Meh", "Sedan", "C557PV777", 5);
        mass[3] = new transport.Car("Kia", "Sportage 4-го поколения", 2.4, "Red", 2018, "South Korea", "Meh", "Sedan", "C777PV777", 5);
        mass[4] = new transport.Car("Hyundai", "Avante", 1.6, "Orange", 2016, "South Korea", "Meh", "Sedan", "C346PV777", 5);
        mass[5] = new transport.Car("Lada", "Vesta", 0, null, 0, null, "", "Sedan", null, 0);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
        System.out.println("-------");
        System.out.println(rty(mass, m));


    }
       public static String rty(Car[] mass, int m){
        int i;
        String resoult = "";
           for (i = 0; i < mass.length; i++) {
               if (m >= 3 && m <=11){
                   mass[i].setSignTires(false);
               }
               else {mass[i].setSignTires(true);}
           }
           return resoult;
}

}