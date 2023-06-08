package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        // Girilen bir ifadenin ilk karakterinin harf  olup olmadığını  kontrol eden code create ediniz..
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ifade girin: ");
        String ifade = scanner.nextLine();

        if (ifade.length() > 0 && Character.isLetter(ifade.charAt(0))) {
            System.out.println("Girilen ifadenin ilk karakteri harftir.");
        } else {
            System.out.println("Girilen ifadenin ilk karakteri harf değildir.");
        }





    }
}
