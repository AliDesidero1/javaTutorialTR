package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        // Girilen iki sayiyi seçilen dört işlemden birine uygulayip sonucu print eden code create ediniz ..
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        System.out.print("İşlem seçin (+, -, *, /): ");
        char islem = scanner.next().charAt(0);
        double sonuc = 0.0;
        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                sonuc = sayi1 / sayi2;
                break;
            default:
                System.out.println("Geçersiz işlem seçimi!");
                return;
        }
        System.out.println("Sonuç: " + sonuc);
    }
}
