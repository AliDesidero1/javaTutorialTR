package ch08_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {
        // başlangic ve bitiş değerleri net bilinen değerler olan tekrarlarda for loop
        // ama adim sayisi belli olmayip bir şarta duruma bagli olan tekrarlarda while loop kullanilmalidir .

        // Task 11den 20ye kadar olan tamsayilari print eden code create ediniz . .
        int number = 11;
        do {
            System.out.println(number);
            number++;
        } while (number < 20);

        // 7 kere javaCAN print eden code create ediniz..

        int count = 1;

        do {
            System.out.println("javaCAN");
            count++;
        } while (count <= 7);

        //2 basamaklı tek sayıları yanyana print eden code create ediniz

        for (int number1 = 11; number1 <= 99; number1 += 2) {
            System.out.print(number1 + " ");
        }
        // girilen metni while loop ile  tersden print eden code create ediniz..
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin: ");
        String input = scanner.nextLine();

        int length = input.length();
        int index = length - 1;

        while (index >= 0) {
            System.out.print(input.charAt(index));
            index--;
        }

        scanner.close();
        // girilen tam sayiya kadar tamsayilarin toplamini print eden code yaziniz .
        Scanner içerik  = new Scanner(System.in);

        System.out.print("Bir tam sayı girin: ");
        int number5 = scanner.nextInt();

        int sum = 0;
        int count1 = 1;

        while (count1 <= number) {
            sum += count1;
            count1++;
        }

        System.out.println("Toplam: " + sum);

        scanner.close();
        // girilen tamsayinin faktoriyelini print eden code create ediniz .


        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int number99 = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Faktöriyel: " + factorial);

        scanner.close();













    }
}
