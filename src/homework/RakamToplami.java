package homework;

import java.util.Scanner;

public class RakamToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üç basamaklı bir sayi giriniz : ");
        int sayi = scanner.nextInt() ;

        int birlerBasamagi = sayi % 10 ;
        int yüzlerBasamagi = sayi / 100 ;

        int toplam = birlerBasamagi + yüzlerBasamagi ;
        System.out.println("ilk ve son rakamlarin toplami : " + toplam );







    }
}
