import java.util.Scanner;
 //Girilen cümlenin aşağıdaki durumları sağlayacak code create ediniz.
   //      1-Girilen cumle java icermiyor
     //    2-Girilen cumle 1 tane java iceriyor
       //  3-Girilen cumlede birden fazla java var
public class JavaCumleKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine();

        int javaSayisi = javaSayisiniBul(cumle);

        if (javaSayisi == 0) {
            System.out.println("Girilen cümle Java içermiyor.");
        } else if (javaSayisi == 1) {
            System.out.println("Girilen cümle 1 tane Java içeriyor.");
        } else {
            System.out.println("Girilen cümlede birden fazla Java var.");
        }
    }
    public static int javaSayisiniBul(String cumle) {
        int javaSayisi = 0;
        int index = 0;

        while (true) {
            index = cumle.indexOf("java", index);
            if (index != -1) {
                javaSayisi++;
                index += 4; // "java" kelimesinin uzunluğu
            } else {
                break;
            }
        }

        return javaSayisi;
    }
}