package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {
        //Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın.
        // Eğer urun miktarı 100 den fazla ise %33  indirim yapıp
       // ödemesi gereken toplam miktarı print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ürün miktarını girin: ");
        int urunMiktari = scanner.nextInt();
        System.out.print("Ürün birim fiyatını girin: ");
        double birimFiyat = scanner.nextDouble();
        double toplamTutar;
        if (urunMiktari > 100) {
            toplamTutar = urunMiktari * birimFiyat * 0.67; // %33 indirim
        } else {
            toplamTutar = urunMiktari * birimFiyat;
        }
        System.out.println("Ödemeniz gereken toplam miktar: " + toplamTutar);
    }
}
