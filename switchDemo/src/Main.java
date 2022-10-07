public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Great ! U passed");
                break;
            case 'B':
                System.out.println("Very Nice ! U passed");
                break;
            case 'C':
                System.out.println("Nice ! U passed");
                break;
            case 'D':
                System.out.println("Not bad. U passed");
                break;
            case 'F':
                System.out.println("U didn't pass. Try harder next time");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}