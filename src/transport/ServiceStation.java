package transport;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;

public class ServiceStation {
    String numberStation;

    public ServiceStation(String numberStation) {
        this.numberStation = numberStation;
    }

    public static String addAuto(String s, Deque q){
       try {
           check(s);
           q.add(s);
           return "На ТО прибыл автомобиль: " + s;
       }catch (TransportTypeException e){
           System.out.println("Error " + e.toString());
       }return "Автобус " + s + " в ТО не нуждается";
    };
    public static String compliteTo(Deque q){
       return "ТО прошел автомобиль: " + q.remove();
    }
    public static void check(String s) throws TransportTypeException{
        if (s == "Maz"){
            throw new TransportTypeException();
        }
    }

}
