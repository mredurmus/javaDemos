public class Main {
    public static void main(String[] args) {
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
            System.out.println("Aranan sayi bulundu");
        } else System.out.println("Aranan sayi bulunamadı");
    }
}