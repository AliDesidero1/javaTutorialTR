import java.util.Scanner;

public class SureDonusturucu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saniye değerini girin: ");
        int saniye = scanner.nextInt();

        int saat = saniye / 3600;
        int dakika = (saniye % 3600) / 60;
        int kalanSaniye = (saniye % 3600) % 60;

        System.out.println("Sonuç: " + saat + " saat, " + dakika + " dakika, " + kalanSaniye + " saniye");

        scanner.close();
    }
}