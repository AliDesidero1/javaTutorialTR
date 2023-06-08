package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifStatement {
    public static void main(String[] args) {
        // girilen yasin 18den büyüklüğünü kontrol eden code create ediniz
        // 18 den küçük ise ehliyet alamaz prin ediniz .
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        if (yas >= 18) {
            System.out.println("Ehliyet alabilirsiniz.");
        } else {
            System.out.println("Ehliyet alamazsınız.");
        }









    }
}
