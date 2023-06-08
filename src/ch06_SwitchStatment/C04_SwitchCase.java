import java.util.Scanner;

public class C04_SwitchCase {
    // Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
    ////break in ozelligini kullanin
    ////29 subat icin sartlarini hatirlayiniz
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ay numarası girin (1-12): ");
        int month = scanner.nextInt();
        int days = getMonthDays(month);
        System.out.println(month + ". ay " + days + " gün çeker.");
    }
    public static int getMonthDays(int month) {
        int days;

        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 28; // Şubat
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                days = -1; // Geçersiz ay numarası
                break;
        }
        return days;
    }
}