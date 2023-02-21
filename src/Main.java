import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       Car car=new Car(1,1223);
       Dannye dannye=new Dannye("2021","solaris",15.204,"black");
        Map<Car,Dannye>map=new HashMap<>();
        map.put(car,dannye);
        for (Map.Entry a:map.entrySet()) {
            System.out.println(a.getKey()+" : "+a.getValue());

        }
    }
}