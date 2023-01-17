import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        transport.Car[] mass = new transport.Car[6];
        transport.Bus[] massBus = new transport.Bus[3];
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
        massBus[0] = new Bus("WAZ","Buka","Green",1998,"Russia",120.8,"345д");
        massBus[1] = new Bus("VAC","Atro","Black",2020,"Germany",230.0,"b234");
        massBus[2] = new Bus("FOTON","Zushi","Green",2010,"Japen",167.6,"567");
        for (int i = 0; i < massBus.length; i++) {
            System.out.println(massBus[i]);
        }
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