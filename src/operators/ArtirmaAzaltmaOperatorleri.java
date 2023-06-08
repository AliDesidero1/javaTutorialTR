package operators;

public class ArtirmaAzaltmaOperatorleri {
    public static void main(String[] args) {

        int sayi1= 55 ;
        int sayi2= 72 ;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        //sayi1++; // sadece birer birer artririr.
        //sayi2--;
        //System.out.println("sayi1 = " + sayi1);
        //System.out.println("sayi2 = " + sayi2);

        //System.out.println("sayi1 = " + sayi1++);
        //System.out.println("sayi2 = " + sayi2--); // ilk işlemle ekrana vermez toplar fakat 2.işlemde artik sayi1 = 56 oldu sayi2= 71 oldu .


        System.out.println("sayi1 = " + ++sayi1);
        System.out.println("sayi2 = " + --sayi2);






















    }
}
