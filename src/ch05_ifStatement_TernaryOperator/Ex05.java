package ch05_ifStatement_TernaryOperator;

public class Ex05 {
    public static void main(String[] args) {
        //Iki tane sayi ayni isaretli ise bu sayilari carpiniz, // return type int
        //farkli isaretli ise "Islem yapamam" mesaji veriniz       //return type String
        int sayi1 = 5;
        int sayi2 = -3;

        int carpim = carpmaIslemi(sayi1, sayi2);
        if (carpim != -1) {
            System.out.println("Sonuç: " + carpim);
        } else {
            System.out.println("İşlem yapamam.");
        }
    }

    public static int carpmaIslemi(int sayi1, int sayi2) {
        if ((sayi1 < 0 && sayi2 < 0) || (sayi1 >= 0 && sayi2 >= 0)) {
            return sayi1 * sayi2;
        } else {
            return -1; // İşlem yapamam durumunu göstermek için -1 döndürülüyor
        }










    }
}
