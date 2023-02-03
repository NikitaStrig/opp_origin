package transport;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;

public class ServiceStation {
    String numberStation;

    public ServiceStation(String numberStation) {
        this.numberStation = numberStation;
    }

    public static String addAuto(Transport transport, Deque q){
       try {
           check(transport);
           q.add(transport.getModel());
           return "На ТО прибыл автомобиль: " + transport.getModel();
       }catch (TransportTypeException e){
           System.out.println("Error " + e.toString());
       }return "Автобус " + transport.getModel() + " в ТО не нуждается";
    };
    public static String compliteTo(Deque q){
       return "ТО прошел автомобиль: " + q.remove();
    }
    public static void check(Transport transport) throws TransportTypeException{
        if (transport.getType() == "Bus"){
            throw new TransportTypeException();
        }
    }

}
