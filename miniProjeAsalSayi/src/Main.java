public class Main {
    public static void main(String[] args) {
        int number = 1;
        if (number==1){
            System.out.println("Sayi asal degildir");
            return;
        }
        if (number<1){
            System.out.println("Geçersiz Sayı");
            return;
        }
        // int remainder(kalan) = number % 2;
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Sayi asaldir");
        } else System.out.println("Sayi asal degildir");
    }
}