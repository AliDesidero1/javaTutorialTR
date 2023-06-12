package ch08_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_whileLoop {
    public static void main(String[] args) {
        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'nin 8 tane tam böleni var

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        System.out.println(number + " sayısının " + count + " tane tam böleni var.");

        scanner.close();

    }
}
