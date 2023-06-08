import java.util.Scanner;

public class AyakSayisiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Çiftlikteki inek sayısını girin: ");
        int inekSayisi = scanner.nextInt();

        System.out.print("Çiftlikteki koyun sayısını girin: ");
        int koyunSayisi = scanner.nextInt();

        System.out.print("Çiftlikteki tavuk sayısını girin: ");
        int tavukSayisi = scanner.nextInt();

        int inekAyakSayisi = 4;
        int koyunAyakSayisi = 4;
        int tavukAyakSayisi = 2;

        int toplamAyakSayisi = (inekAyakSayisi * inekSayisi) + (koyunAyakSayisi * koyunSayisi) + (tavukAyakSayisi * tavukSayisi);

        System.out.println("Çiftlikteki hayvanların toplam ayak sayısı: " + toplamAyakSayisi);

        scanner.close();
    }
}