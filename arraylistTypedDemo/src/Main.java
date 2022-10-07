import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Trabzon");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Aydın");
        sehirler.remove("İstanbul");
        Collections.sort(sehirler);
        for(String i:sehirler){
            System.out.println(i);
        }
    }
}