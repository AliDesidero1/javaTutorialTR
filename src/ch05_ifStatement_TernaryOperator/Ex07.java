package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        //girilen bir yılın artık (LEAP YEAR) subat 29 mu olmasını kontrol eden code create ediniz..
        //artık yıl:
        // Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
        //Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
          //      Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece
        //400’ün katı olan yıllar artık yıldır.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir yıl girin: ");
        int yil = scanner.nextInt();
        boolean artikYil = false;
        if (yil % 4 == 0) {
            if (yil % 100 != 0) {
                if (yil % 400 == 0) {
                    artikYil = true;
                }
            } else {
                artikYil = false;
            }
        }
        if (artikYil) {
            System.out.println(yil + " bir artık yıldır. Şubat ayı 29 gün çeker.");
        } else {
            System.out.println(yil + " bir artık yıl değildir. Şubat ayı 28 gün çeker.");
        }
    }
}
