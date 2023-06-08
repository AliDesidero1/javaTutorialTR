package ch06_SwitchStatment;

import java.util.Scanner;

public class C02_SwitchStatement {
    public static void main(String[] args) {
        //Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
        //        Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
        //programi izlemek zorlasacaktir.
        //        Programimizin bir degerini bir çok degerle
        //karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
        //ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
        //        Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
        //        Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
        //çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
        //Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.
        //TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ...
        //Switch de sadece int, byte, short, char, String data tipleri kullanilabilir
        //Eger 3 den fazla durum varsa switch() tercih edilir.

        // TASK -> kullanıcının girdiği rakamı yazı ile print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir rakam girin: ");
        int number = scanner.nextInt();
        String word = convertToWord(number);
        System.out.println("Girilen rakamın yazılışı: " + word);
    }
    public static String convertToWord(int number) {
        switch (number) {
            case 0:
                return "Sıfır";
            case 1:
                return "Bir";
            case 2:
                return "İki";
            case 3:
                return "Üç";
            case 4:
                return "Dört";
            case 5:
                return "Beş";
            case 6:
                return "Altı";
            case 7:
                return "Yedi";
            case 8:
                return "Sekiz";
            case 9:
                return "Dokuz";
            default:
                return "Bilinmeyen";
        }
    }
}
