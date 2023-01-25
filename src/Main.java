import com.sun.jdi.connect.Transport;
import transport.*;

import javax.annotation.processing.Completion;

public class Main {
    public static void main(String[] args) {
        transport.Car[] massCar = new transport.Car[4];
        transport.Bus[] massBus = new transport.Bus[4];
        transport.Trucks[] massTrucks = new transport.Trucks[4];
        DriverB driverB_1 = new DriverB("Max",true,5);
        DriverB driverB_2 = new DriverB("Pol",true,3);
        DriverB driverB_3 = new DriverB("Zed",true,6);
        DriverB driverB_4 = new DriverB("Max",true,1);

        DriverC driverC_1 = new DriverC("Max",true,5);
        DriverC driverC_2 = new DriverC("Pol",true,3);
        DriverC driverC_3 = new DriverC("Zed",true,6);
        DriverC driverC_4 = new DriverC("Max",true,1);

        DriverD driverD_1 = new DriverD("Max",true,5);
        DriverD driverD_2 = new DriverD("Pol",true,3);
        DriverD driverD_3 = new DriverD("Zed",true,6);
        DriverD driverD_4 = new DriverD("Max",true,1);



        massCar[0] = new Car("Ford","Mustang",3.5,driverB_1);
        massCar[1] = new Car("BMV","Z1",3.5,driverB_2);
        massCar[2] = new Car("Fiat","Lion",3.5,driverB_3);
        massCar[3] = new Car("Chevrolet","Camaro",4.5,driverB_4);
        for (int i = 0; i < massCar.length; i++) {
            System.out.println(massCar[i]);

        }
            massBus[0] = new Bus("Ford","Mustang",3.5,driverD_1);
            massBus[1] = new Bus("BMV","Z1",3.5,driverD_2);
            massBus[2] = new Bus("Fiat","Lion",3.5,driverD_3);
            massBus[3] = new Bus("Chevrolet","Camaro",4.5,driverD_4);
        System.out.println("-------");
        for (int i = 0; i < massBus.length; i++) {
            System.out.println(massBus[i]);
        }
        System.out.println("-------");
        massTrucks[0] = new Trucks("Ford","Mustang",3.5,driverC_1);
        massTrucks[1] = new Trucks("BMV","Z1",3.5,driverC_2);
        massTrucks[2] = new Trucks("Fiat","Lion",3.5,driverC_3);
        massTrucks[3] = new Trucks("Chevrolet","Camaro",4.5,driverC_4);
        for (int i = 0; i < massTrucks.length; i++) {
            System.out.println(massTrucks[i]);
        }
    printInfoDriverB(massCar);
        printInfoDriverC(massTrucks);
        printInfoDriverD(massBus);


        }
    private static void printInfoDriverB(Car mass[]){
        for (int i = 0; i < mass.length; i++) {
            System.out.println("водитель " +mass[i].getDraiver()+"управляет автомобилем "
                    +mass[i].getBrand()+ " и будет участвовать в заезде");
        }

    }
    private static void printInfoDriverC(Trucks mass[]){
        for (int i = 0; i < mass.length; i++) {
            System.out.println("водитель " +mass[i].getDraiver()+"управляет автомобилем "
                    +mass[i].getBrand()+ " и будет участвовать в заезде");
        }

    }
    private static void printInfoDriverD(Bus mass[]){
        for (int i = 0; i < mass.length; i++) {
            System.out.println("водитель " +mass[i].getDraiver()+"управляет автомобилем "
                    +mass[i].getBrand()+ " и будет участвовать в заезде");
        }

    }


}