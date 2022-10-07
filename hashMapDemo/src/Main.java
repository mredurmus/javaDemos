import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("hello","merhaba");
        sozluk.put("book","kitap");
        sozluk.put("computer","bilgisayar");
        sozluk.put("keyboard","klavye");
        sozluk.put("mouse","fare");
        sozluk.remove("hello");

        for (String item : sozluk.keySet()){
            System.out.println("Eleman-"+item+ " Değer-"+sozluk.get(item));
        }

        System.out.println(sozluk.get("hello"));
        System.out.println(sozluk.size());
    }
}