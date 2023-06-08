import java.util.Scanner;

public class RakamYazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üç basamaklı bir sayı girin: ");
        int sayi = scanner.nextInt();

        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = (sayi / 10) % 10;
        int yuzlerBasamagi = (sayi / 100) % 10;

        System.out.println("Birler Basamağı: " + birlerBasamagi);
        System.out.println("Onlar Basamağı: " + onlarBasamagi);
        System.out.println("Yüzler Basamağı: " + yuzlerBasamagi);

        scanner.close();
    }
}