import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }

    public static void getFileInfo(){
        File file = new File("C:\\javademos\\files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya adı : "+ file.getName());
            System.out.println("Dosya yolu : "+ file.getAbsolutePath());
            System.out.println("Dosya yazılabılır mı ? : "+ file.canWrite());
            System.out.println("Dosya okunabilir mi ? : "+ file.canRead());
            System.out.println("Dosya boyutu(byte) : "+ file.length());
    }
}

    public static void createFile(){
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }else {
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile(){
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosyaya yazildi");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}