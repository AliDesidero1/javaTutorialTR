import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// kullanicidan alinacak email adresinin sonunun gmail ile bitip bitmedigini ögrenen codlama örnegidir.

        System.out.print("E-mail hesabınızı girin: ");
        String email = scanner.nextLine();

        if (email.endsWith("@gmail.com")) {
            System.out.println("Hesabınız onaylandı.");
        } else {
            System.out.println("Geçerli hesap giriniz.");
        }
    }
}





