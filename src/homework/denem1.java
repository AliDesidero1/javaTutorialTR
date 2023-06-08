package homework;

import java.util.Scanner;

public class denem1 {
    public static void main(String[] args) {
        //TASK giirlen sifrenin dogru ise erisim izni verin yanlis ise vermeyin
        // ternary ile switch ile if ile yapiniz
        //bug i bulunuz
        //contains methodu sifre kontrol islemlerinde KULLANILMAMALI
            Scanner scanner = new Scanner(System.in);
            String şifre = "123456" ;
            System.out.print("Şifreyi girin: ");
            String password = scanner.nextLine();
            // Ternary operatörü kullanarak erişim iznini kontrol etme
            boolean erisimizni = password.equals("dogru şifre") ? true : false;
            System.out.println("Erişim izni: " +erisimizni );
            // Switch ifadesi kullanarak erişim iznini kontrol etme
            String erisimdurumu;
            switch (password) {
                case "dogruşifre":
                    erisimdurumu = "Erişim izni: True";
                    break;
                default:
                    erisimdurumu = "Erişim izni: False";
                    break;
            }
            System.out.println(erisimdurumu);
            // if ifadesi kullanarak erişim iznini kontrol etme
            boolean erisimiznin;
            if (password.equals("dogru şifre")) {
                erisimiznin = true;
            } else {
                erisimiznin = false;
            }
            System.out.println("Erişim izni: " + erisimiznin);
    }
}
