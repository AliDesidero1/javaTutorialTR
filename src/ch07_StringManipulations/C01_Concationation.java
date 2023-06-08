package ch07_StringManipulations;

public class C01_Concationation {
    public static void main(String[] args) {
        // concat () methodu içine parametre aldigi string variable i calistigii stringin sonuna ekler ..
        // javada + işlemi yapilirken eger en az bir string variable varsa java toplama degil concat yapar.


        String name = "Batu" ;
        String title = "SDET QA " ;
        int age = 30 ;
        System.out.println(name + title);
        System.out.println("name.concat(title) = " + name.concat(title));
        System.out.println("age = "+ age);
        System.out.println(age);
        // String i int e nasil ceviririz ?
        String number = "123456" ;
        System.out.println("number = " + number+1);
        // output 123457 olmali
        String str1= "" ;
        System.out.println("str1.length() = " + str1.length());

        String str2 = " " ;
        System.out.println("str2.length() = " + str2.length());
        String str3 = null ;
        System.out.println("str3.length() = " + str3.length());
       // System.out.println("str1.concat() = " + str1.concat());
        String str4 = "null" ;
        System.out.println("str4.length() = " + str4.length());








    }
}
