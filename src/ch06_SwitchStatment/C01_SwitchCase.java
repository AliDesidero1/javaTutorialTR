package ch06_SwitchStatment;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        //if else sartli islemlerde
          //      ternary sartli islemlerde
           //     switch case i de sartli islemlerde kullanilir tek bir fark karsılastirma yapilmaz
            //    örnegin kayit için 1 e bas denilirse bunu  if else ile yapilabilir switch durumuna
             //   kayidi alip case e 1 verilip islem yapilir .

        //TASK>>> 0 ile 2 arası girilen rakami yazi ile yazdiriniz .
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir rakam girin: ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 2) {
            String word = convertToWord(number);
            System.out.println("Girilen rakamın yazılışı: " + word);
        } else {
            System.out.println("Girilen rakam 0 ile 2 arasında değil.");
        }
    }
    // switch ile yapilan
    public static String convertToWord(int number) {
        switch (number) {
            case 0:
                return "Sıfır";
            case 1:
                return "Bir";
            case 2:
                return "İki";
            default:
                return "Bilinmeyen";
        }
    }
}
