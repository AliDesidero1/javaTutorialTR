import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
        // TASK-> girilen bir tamsayı çiftse yarısını değilse
        // "girilen sayı tek oldugu için yarısı tamsayı değildir"
        // print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı girin: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            int half = number / 2;
            System.out.println("Girilen sayının yarısı: " + half);
        } else {
            System.out.println("Girilen sayı tek olduğu için yarısı tamsayı değildir.");
        }
    }
}