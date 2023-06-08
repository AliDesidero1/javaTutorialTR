package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // girilen bir sayinin negatif ve pozitifligini kontrol eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi > 0) {
            System.out.println("Girilen sayı pozitiftir.");
        } else if (sayi < 0) {
            System.out.println("Girilen sayı negatiftir.");
        }





    }
}
