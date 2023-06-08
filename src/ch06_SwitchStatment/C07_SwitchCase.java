package ch06_SwitchStatment;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir gün girin (Pazartesi için 1, Salı için 2, ...): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Geçersiz gün numarası!");
                break;
        }
    }
}
