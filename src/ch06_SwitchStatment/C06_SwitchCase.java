package ch06_SwitchStatment;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
        //çıkış işlemlerinin yapıldıgı bir
        //ATM app. code create ediniz
        Scanner scanner = new Scanner(System.in);
        int balance = 1000; // Başlangıç bakiyesi 1000 TL
        while (true) {
            System.out.println("ATM'ye hoş geldiniz!");
            System.out.println("1 - Bakiye Sorgulama");
            System.out.println("2 - Para Yatırma");
            System.out.println("3 - Para Çekme");
            System.out.println("4 - Çıkış");
            System.out.print("İşlem seçin (1-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Bakiyeniz: " + balance + " TL");
                    break;
                case 2:
                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
                    int depositAmount = scanner.nextInt();
                    balance += depositAmount;
                    System.out.println(depositAmount + " TL yatırıldı. Güncel bakiyeniz: " + balance + " TL");
                    break;
                case 3:
                    System.out.print("Çekmek istediğiniz miktarı girin: ");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("Yetersiz bakiye!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println(withdrawAmount + " TL çekildi. Güncel bakiyeniz: " + balance + " TL");
                    }
                    break;
                case 4:
                    System.out.println("ATM'den çıkış yapılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Tekrar deneyin.");
                    break;
            }

            System.out.println(); // İşlemler arasında bir boşluk bırakılıyor
        }
        }
}
