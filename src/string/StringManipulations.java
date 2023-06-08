package string;
// String Class
public class StringManipulations {
    public static void main(String[] args) {
        //String name = "hakan" ;
        //String name1 = "Hakan" ;

        // if( name.equalsIgnoreCase(name1)){
           // System.out.println("ayni isim bunlar");
       // }else System.out.println("ayni degil");
        // concat ()
       // String str = "bayern";
        //String str2 = "munih";
       // String space = " " ;

       // System.out.println(str);
        //System.out.println(str2);
       // System.out.println(str+" "+str2);
        //System.out.println(str.concat(space). concat(str2));

        // contains
        String countries = "  usa , england , germany , netherlands   ";
        System.out.println("countries.contains(\"germany\") =  " +  countries.contains("turkey"));

        //trim
        System.out.println("countries.length() = " + countries.length());
        System.out.println("countries.trim() = " + countries.trim());
        System.out.println("countries = " + countries);
        System.out.println("countries.trim() = " + countries.trim().length());
        //charAt
        System.out.println("countries.charAt(1) = " + countries.charAt(4));
// compareTo
        String team = "bayernmunih" ;
        String team2 = "arsenal " ;
        System.out.println("team.compareTo(team2 ) = " + team.compareTo(team2));
        // replace
       //  String countries = "  usa , england , germany , netherlands   ";
        countries.replace("england" , "britain") ;

        System.out.println("countries = " + countries);







    }
}