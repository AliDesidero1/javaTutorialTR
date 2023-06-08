package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // kullanicidan 100 üzerinden notunu isteyin . Notu harf sistemine cevirip yazdirin .
        // Not'u harf sistemine cevirip yazdirin.
        //50’den kucukse "D",->1,2,3..49
        //=50  <60 arasi "C",->50,51,52,..59
        //=60  <80 arasi "B",->60,61,62,63..79
        //=80’nin uzerinde ise "A"->80,81..100

        Scanner scanner = new Scanner(System.in);
        System.out.print("Notunuzu girin (0-100 arası): ");
        int not = scanner.nextInt();

        String harfNotu;

        if (not < 50) {
            harfNotu = "D";
        } else if (not < 60) {
            harfNotu = "C";
        } else if (not < 80) {
            harfNotu = "B";
        } else {
            harfNotu = "A";
        }

        System.out.println("Harf Notunuz: " + harfNotu);








    }
}
