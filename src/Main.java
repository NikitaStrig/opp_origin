import transport.Bus;
import transport.Car;
import transport.Trucks;

import javax.annotation.processing.Completion;

public class Main {
    public static void main(String[] args) {
        transport.Car[] massCar = new transport.Car[4];
        transport.Bus[] massBus = new transport.Bus[4];
        transport.Trucks[] massTrucks = new transport.Trucks[4];

        massCar[0] = new Car("Ford","Mustang",3.5);
        massCar[1] = new Car("BMV","Z1",3.5);
        massCar[2] = new Car("Fiat","Lion",3.5);
        massCar[3] = new Car("Chevrolet","Camaro",4.5);
        for (int i = 0; i < massCar.length; i++) {
            System.out.println(massCar[i]);

        }
            massBus[0] = new Bus("Ford","Mustang",3.5);
            massBus[1] = new Bus("BMV","Z1",3.5);
            massBus[2] = new Bus("Fiat","Lion",3.5);
            massBus[3] = new Bus("Chevrolet","Camaro",4.5);
        System.out.println("-------");
        for (int i = 0; i < massBus.length; i++) {
            System.out.println(massBus[i]);
        }
        System.out.println("-------");
        massTrucks[0] = new Trucks("Ford","Mustang",3.5);
        massTrucks[1] = new Trucks("BMV","Z1",3.5);
        massTrucks[2] = new Trucks("Fiat","Lion",3.5);
        massTrucks[3] = new Trucks("Chevrolet","Camaro",4.5);
        for (int i = 0; i < massTrucks.length; i++) {
            System.out.println(massTrucks[i]);
        }
    }


}