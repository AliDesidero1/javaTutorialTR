package homework;

import java.util.Scanner;

public class ElseorIf {
    public static void main(String[] args) {
        // Oluşturulan double'lar hakkında (num1, num2)
        //birbirine eşit olup olmadıklarını doğrulayın.
        //      Eğer eşitlerse konsolda true yazacaktır.  */

        Scanner dp = new Scanner(System.in);

        double num1 = dp.nextDouble();
        double num2 = dp.nextDouble();
        boolean esitMi = num1 == num2;
        System.out.println(esitMi);



    }
}