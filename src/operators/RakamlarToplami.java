import java.util.Scanner;

public class RakamlarToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üç basamaklı bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Rakamları elde etmek için bölme ve mod işlemlerini kullanıyoruz
        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = (sayi / 10) % 10;
        int yuzlerBasamagi = (sayi / 100) % 10;

        int toplam = birlerBasamagi + onlarBasamagi + yuzlerBasamagi;

        System.out.println("Rakamların toplamı: " + toplam);

        scanner.close();
    }
}