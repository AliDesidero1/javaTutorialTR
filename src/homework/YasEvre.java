package homework;
import java.util.Scanner;
public class YasEvre {
    //Kullanicidan bir sayi alin.
    //Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin.
    //Eger 10 dan buyuk ise "Buyuksun!" yazdirin.
    //Eger 10 dan kucuk ise "Normalsin!" yazdirin.
    //Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin.
    //Eger -10 dan buyuk ise "Negatifsin!" yazdirin.
    //Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        if (number > 0) {
            if (number > 10) {
                System.out.println("Büyüksün!");
            } else {
                System.out.println("Normalsin!");
            }
        } else {
            if (number > -10) {
                System.out.println("Negatifsin!");
            } else {
                System.out.println("Çok negatifsin!");
            }
        }
    }
}