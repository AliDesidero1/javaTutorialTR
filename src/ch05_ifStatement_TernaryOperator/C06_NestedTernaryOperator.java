package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
        // kullanicidan bir sayi aliniz . sayi 0 dan büyük esit ise nested burada devreye giricek
        //10den kucuk olup olmadigini kontrol ediniz
        // 10dan kucuk ise ekrana "rakam" yazdiriniz degilse "pozitif sayi" yazdiriniz .
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi >= 0) {
            if (sayi < 10) {
                System.out.println("rakam");
            } else {
                System.out.println("pozitif sayı");
            }
        } else {
            System.out.println("Negatif sayı");
        }
    }
}
