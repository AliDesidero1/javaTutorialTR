package ch05_ifStatement_TernaryOperator;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        // Ternary ile yapilan islemler if-else blok ile de yapilabilir
        // Ternary hercih edilmesi yapinin basit okuabilir ve anlasılabilir olmasi içindir ( clean code )
        // Ternary icerisinde kompleks kodlar yerine dogrudan sonuc üreten veya sonucu veren daha basic codelar bulunur ..

        // bir sayinin pozitif olup olmadigini ekrana yazdiran kodu giriniz .
        int a = 3 ;
        if (a >0) {
            System.out.println("sayi pozitif ");
        }
        else {
            System.out.println("sayi negatif");
        };
        // CTE atama yapmak lazim a > 0 ? "pozitif " : "negatif " ; Not a statement

        String sonuc = a > 0 ? "pozitif" : "negatif" ;
        System.out.println(sonuc);

        // atama yapmadan nasil kullanilir
        System.out.println("atama yapmadan sonuc ");
        System.out.println(a > 0 ? "pozitif " : "negatif ");









    }
}
