package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        //girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Girilen sayı çifttir.");
        } else {
            System.out.println("Girilen sayı tektir.");
        }











    }
}
