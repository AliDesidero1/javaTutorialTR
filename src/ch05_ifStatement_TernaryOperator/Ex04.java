package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //  Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
        //  Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int mutlakDeger = (sayi < 0) ? -1 * sayi : sayi;

        System.out.println("Mutlak Değer: " + mutlakDeger);







    }
}
