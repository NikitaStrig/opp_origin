import transport.*;

import javax.annotation.processing.Completion;
import javax.tools.Diagnostic;
import java.util.*;

public class Main {
    public static void main(String[] args) throws TransportTypeException {
        transport.Car[] massCar = new transport.Car[4];
        transport.Bus[] massBus = new transport.Bus[4];
        transport.Trucks[] massTrucks = new transport.Trucks[4];
        List<Mechanic> allMech = new ArrayList<>();
        allMech.add(new Mechanic("Bory", "Last", "TechPech"));
        allMech.add(new Mechanic("Ivan", "Yota", "CarPar"));
        allMech.add(new Mechanic("Max", "Fax", "AuTu"));

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


        System.out.println("--------");

        List<Transport> allCars = new ArrayList<>();
        allCars.add(new Car("Ford", "Mustang", 3.5, new DriverB("max", true, 5), Body.SEDAN, "Car", Bory));
        allCars.add(new Trucks("Skoda", "Cody", 3.0, driverC_3, LoadCapacity.N3, "Trucks", Ivan));
        allCars.add(new Bus("Reno", "dust", 6.5, driverD_4, CapacityBus.especiallySmall, "", Max));
        // -------------------------------------
        for (int i = 0; i < allCars.size(); i++) {
            System.out.println("Автомобиль: " + allCars.get(i).getModel() + " Водитель: " +
                    allCars.get(i).getDraiver().getName() + " Механник: " + allCars.get(i).getMechanic().getFirstName()
                    + " " + allCars.get(i).getMechanic().getFirstName());

        }
        System.out.println("--------");
        Deque<String> state = new LinkedList<>();
        state.add("Audi");
        state.add("Mers");
        System.out.println(ServiceStation.compliteTo(state));
        System.out.println(ServiceStation.addAuto(
                new Car("Ford", "Mustang", 3.5,
                        new DriverB("max", true, 5), Body.SEDAN, "Car", Bory), state));
        System.out.println(ServiceStation.compliteTo(state));
        System.out.println(ServiceStation.addAuto(
                new Bus("Mer", "Atr", 1.5, driverD_2, CapacityBus.small, "Bus", Bory), state));
        System.out.println(ServiceStation.compliteTo(state));
        System.out.println(ServiceStation.addAuto(
                new Trucks("BMW", "WW", 2.5, driverC_2, LoadCapacity.N2, "Trucks", Max), state));
        System.out.println(ServiceStation.compliteTo(state));
        System.out.println("--------");
        Map<Transport, Mechanic> mapCar = new HashMap<>();
        mapCar.put(new Car("Ford", "Mustang", 3.5, new DriverB("max", true, 5), Body.SEDAN, "Car", Bory), allMech.get(0));
        mapCar.put(new Bus("Mer", "Atr", 1.5, driverD_2, CapacityBus.small, "Bus", Max), allMech.get(1));
        mapCar.put(new Trucks("BMW", "WW", 2.5, driverC_2, LoadCapacity.N2, "Trucks", Max), allMech.get(2));
        for (Map.Entry<Transport, Mechanic> car : mapCar.entrySet()) {
            System.out.println("Автомобиль " + car.getKey().getModel() + " Механник " + car.getValue().getFirstName());
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


