package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
         // Iki sayidan kucuk olani secen kodu yaziniz ternary kullaniniz..
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Birinci sayiyi giriniz ");
        int sayi1 = scanner.nextInt();
        System.out.println("ikinci sayiyi giriniz ");
        int sayi2 = scanner.nextInt();
        int kucuksayi = (sayi1< sayi2 ) ? sayi1 : sayi2 ;
        System.out.println("küçük sayi : "+ kucuksayi );




    }
}
