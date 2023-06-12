package ch08_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        //task-> girilen sayı 17 den kucuk ise "kazandınız" print eden  değilse ise sayı girişi isteyen
        //  code create ediniz...
        Scanner scanner = new Scanner(System.in);
        int numara;
        do {
            System.out.print("Bir sayı girin: ");
            numara = scanner.nextInt();
            if (numara < 17) {
                System.out.println("Kazandınız!");
            } else {
                System.out.println("Sayı 17'den büyük veya eşit. Yeniden sayı girin.");
            }
        } while (numara >= 17);

        scanner.close();

    }
}
