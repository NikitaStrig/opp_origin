package transport;
import java.util.Queue;
import java.util.LinkedList;

public class ServiceStation {
    String numberStation;

    public ServiceStation(String numberStation) {
        this.numberStation = numberStation;
    }

    public String addAuto(){
       return "На ТО приехал автомобиль: ";
    };
    public String compliteTo(){
        return "ТО прошел: " ;
    }

}
