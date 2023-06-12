package ch08_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {
        // TASK girilen pozitif sayidan 100 e kadar 4ün kati tamsayilari print eden code create ediniz .

            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir pozitif sayı girin: ");
            int sayi = scanner.nextInt();
            if (sayi > 0) {
                for (int i = sayi; i <= 100; i += 4) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Geçerli bir pozitif sayı girin.");
            }
            scanner.close();
        }
    }



