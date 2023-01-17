import transport.Car;

public class Main {
    public static void main(String[] args) {
        transport.Car[] mass = new transport.Car[6];
        int m = 1;
        mass[0] = new transport.Car("Lada", "Granta", "Yalow", 2015, "Russia", 350, 1.7, "Meh", "Sedan","C447PV777",5);
        mass[1] = new transport.Car("Lada", "Granta", "Yalow", 2015, "Russia", 350, 1.7, "Meh", "Sedan","C447PV777",5);
        mass[2] = new transport.Car("Lada", "Granta", "Yalow", 2015, "Russia", 350, 1.7, "Meh", "Sedan","C447PV777",5);
        mass[3] = new transport.Car("Lada", "Granta", "Yalow", 2015, "Russia", 350, 1.7, "Meh", "Sedan","C447PV777",5);
        mass[4] = new transport.Car("Lada", "Granta", "Yalow", 2015, "Russia", 350, 1.7, "Meh", "Sedan","C447PV777",5);
        mass[5] = new transport.Car("Lada", "Granta", "Yalow", 2015, "Russia", 350, 1.7, "Meh", "Sedan","C447PV777",5);
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
                   mass[i].setSummerTires(true);
                   mass[i].setWinterTires(false);
                   resoult = resoult + mass[i] + "\n";
               } else {mass[i].setSummerTires(false);
                   mass[i].setWinterTires(true);
                   resoult = resoult + mass[i] + "\n";}

           }
           return resoult;
}

}