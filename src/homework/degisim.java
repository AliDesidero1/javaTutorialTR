package homework;

public class degisim {
    public static void main(String[] args) {
        String str = "arden";
        String replacedStr = str.replace('a', 'x').replace('e', 'a').replace('x', 'e');

        System.out.println("Orijinal String: " + str);
        System.out.println("Değiştirilmiş String: " + replacedStr);
    }
}
   // String name = "ahmet";
//   String replacedName = name.replace('a', 'e').replace('e', 'a');

//System.out.println("Orijinal İsim: " + name);
  //      System.out.println("Değiştirilmiş İsim: " + replacedName);