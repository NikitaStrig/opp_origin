import transport.*;

import javax.annotation.processing.Completion;
import javax.tools.Diagnostic;
import java.util.*;

public class Main {
    public static void main(String[] args) throws TransportTypeException {
        transport.Car[] massCar = new transport.Car[4];
        transport.Bus[] massBus = new transport.Bus[4];
        transport.Trucks[] massTrucks = new transport.Trucks[4];
        int pac = 2;
        Mechanic Bory = new Mechanic("Bory", "Last", "TechPech");
        Mechanic Ivan = new Mechanic("Ivan", "Yota", "CarPar");
        Mechanic Max = new Mechanic("Max", "Fax", "AuTu");

        DriverB driverB_1 = new DriverB("Max", true, 5);
        DriverB driverB_2 = new DriverB("Pol", true, 3);
        DriverB driverB_3 = new DriverB("Zed", true, 6);
        DriverB driverB_4 = new DriverB("Max", true, 1);

        DriverC driverC_1 = new DriverC("Саша", true, 5);
        DriverC driverC_2 = new DriverC("Маша", true, 3);
        DriverC driverC_3 = new DriverC("Степа", true, 6);
        DriverC driverC_4 = new DriverC("Максим", true, 1);

        DriverD driverD_1 = new DriverD("Герман", true, 5);
        DriverD driverD_2 = new DriverD("Сергей", true, 3);
        DriverD driverD_3 = new DriverD("Арат", true, 6);
        DriverD driverD_4 = new DriverD("Марат", true, 1);


        massCar[0] = new Car("Ford", "Mustang", 3.5, driverB_1, Body.SEDAN, "Car", Bory);
        massCar[1] = new Car("BMV", "Z1", 3.5, driverB_2, Body.HATSHBACK, "Bas", Ivan);
        massCar[2] = new Car("Fiat", "Lion", 3.5, driverB_3, Body.CROSSOVER, "", Bory);
        massCar[3] = new Car("Chevrolet", "Camaro", 4.5, driverB_4, Body.SEDAN, "Car", Max);
        for (int i = 0; i < massCar.length; i++) {
            System.out.println(massCar[i]);

        }
        massBus[0] = new Bus("Ford", "F100", 6.0, driverD_1, CapacityBus.average, "Bus", Ivan);
        massBus[1] = new Bus("Mer", "Atr", 1.5, driverD_2, CapacityBus.small, "Bus", Bory);
        massBus[2] = new Bus("Fiat", "34", 7.5, driverD_3, CapacityBus.extraLarge, "Bus", Max);
        massBus[3] = new Bus("Reno", "dust", 6.5, driverD_4, CapacityBus.especiallySmall, "", Ivan);
        System.out.println("-------");
        for (int i = 0; i < massBus.length; i++) {
            System.out.println(massBus[i]);
        }
        System.out.println("-------");
        massTrucks[0] = new Trucks("Myu", "Mus", 2.0, driverC_1, LoadCapacity.N1, null, Bory);
        massTrucks[1] = new Trucks("BMW", "WW", 2.5, driverC_2, LoadCapacity.N2, "Trucks", Max);
        massTrucks[2] = new Trucks("Skoda", "Cody", 3.0, driverC_3, LoadCapacity.N3, "Trucks", Ivan);
        massTrucks[3] = new Trucks("Chevrolet", "Tum", 5.5, driverC_4, LoadCapacity.N1, null, Max);
        for (int i = 0; i < massTrucks.length; i++) {
            System.out.println(massTrucks[i]);
        }

        System.out.println("--------");

        Car test1 = new Car("Ford", "Mustang", 3.5, new DriverB("max", true, 5), Body.SEDAN, "Car", Bory);
        Bus test2 = new Bus("Ford", "F100", 6.0, new DriverD("max", false, 5), CapacityBus.average, "Bus", Max);
        Trucks test3 = new Trucks("Chevrolet", "Tum", 5.5, new DriverC("max", true, 5), LoadCapacity.N1, "Track", Ivan);
        checkTran(test1, test2, test3);


        //  printInfoDriverB(massCar);
        //  printInfoDriverC(massTrucks);
        // printInfoDriverD(massBus);
        System.out.println("--------");

        List<String> allCars = new ArrayList<>();
        allCars.add(test1.getModel());
        allCars.add(test2.getModel());
        allCars.add(test3.getModel());
        // -------------------------------------
        printMechDriverAuto(allCars,);
        //printMechDriverAutoBus(allCars, massBus);
        //printMechDriverAutoTrack(allCars, massTrucks);
        //----------------------------
     //   ArrayDeque<String> states = new ArrayDeque<>();
      //  states.add(massCar[0].getModel());

    }



    private static void printMechDriverAuto(List array, Transport transport) {
        int i;
        for (i = 0; i < array.size(); i++) {
            if (transport.getModel() == array.get(i)){
                System.out.println("Марка: " + array.get(i) + " Водитель: " + transport.getDraiver() +
                        " Механник: " + transport.getMechanic().getFirstName() + " "
                        + transport.getMechanic().getLastName());
            }
        }
    }
    private static void printMechDriverAutoBus(List arrayList, Bus[] bus) {
        int i;
        int b;
        for (i = 0; i < arrayList.size(); i++) {
            for (b = 0; b < bus.length; b++)
                if (arrayList.get(i) == bus[b].getModel()) {
                    System.out.println("Модель автобуса " + arrayList.get(i) + " Водитель " + bus[b].getDraiver().getName()
                            + " Механик " + bus[b].getMechanic().getFirstName() + " " + bus[b].getMechanic().getLastName());
                }
        }
    }
    private static void printMechDriverAutoTrack(List arrayList, Trucks[] trucks) {
        int i;
        int t;
        for (i = 0; i < arrayList.size(); i++) {
            for (t = 0; t < trucks.length; t++)
                if (arrayList.get(i) == trucks[t].getModel()) {
                    System.out.println("Модель трака " + arrayList.get(i) + " Водитель " + trucks[t].getDraiver().getName()
                            + " Механик " + trucks[t].getMechanic().getFirstName() + " " + trucks[t].getMechanic().getLastName());
                }
        }
    }





    public static void checkTran(Transport... transports) throws TransportTypeException {
        for (Transport transport : transports) {
            try {
                transport.diagnostikPass();
                System.out.println(transport.getType() + " " + transport.getModel());
            } catch (TransportTypeException e) {
                System.out.println("Error caught" + e.toString());
            }
        }
    }

    private static void printInfoDriverB(Car mass[]) {
        for (int i = 0; i < mass.length; i++) {
            System.out.println("водитель " + mass[i].getDraiver() + "управляет автомобилем "
                    + mass[i].getBrand() + " и будет участвовать в заезде");
        }

    }


    private static void printInfoDriverC(Trucks mass[]) {
        for (int i = 0; i < mass.length; i++) {
            System.out.println("водитель " + mass[i].getDraiver() + "управляет автомобилем "
                    + mass[i].getBrand() + " и будет участвовать в заезде");
        }

    }

    private static void printInfoDriverD(Bus mass[]) {
        for (int i = 0; i < mass.length; i++) {
            System.out.println("водитель " + mass[i].getDraiver() + "управляет автомобилем "
                    + mass[i].getBrand() + " и будет участвовать в заезде");
        }
    }


}


