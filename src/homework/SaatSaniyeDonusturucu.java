import java.util.Scanner;

public class SaatSaniyeDonusturucu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saat değerini girin: ");
        int saat = scanner.nextInt();

        int saniye = saat * 3600;

        System.out.println("Saniye değeri: " + saniye + " saniye");

        scanner.close();
    }
}