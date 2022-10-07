public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = {1, 2, 5, 7, 9, 0};
        int aranacak = 9;
        boolean isFound = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            mesajVer("Aranan sayi bulundu" + aranacak);
        } else mesajVer("Aranan sayi bulunamadi" + aranacak);
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}