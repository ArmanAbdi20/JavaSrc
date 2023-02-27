package J17_PassByValue;

public class C04_PassByValue {

    static double etiketFiyati;
    static double indirimOrani;
    public static void main(String[] args) {



              /*
          eger bir method'a yapılan değişiklik kalıcı olsun istenirse
          1.değişklik  yapılan variable'lar static olarak tanımlanır.
              */


        etiketFiyati=100; // bu değer her yer için sabit oldu

        indirimOrani=0.1; //

        System.out.println("indirim öncesi etiket fiyatı :" + etiketFiyati);

        parametreliİndir(etiketFiyati,indirimOrani);
        indirParametresiz();

        indirimOrani=0.25;

        parametreliİndir(etiketFiyati,indirimOrani);
        indirParametresiz();

        indirimOrani=0.5;

        parametreliİndir(etiketFiyati,indirimOrani);
        indirParametresiz();

        System.out.println("indirim sonrası etiket fiyatı :" + etiketFiyati);




    }

    private static void indirParametresiz() {
        etiketFiyati*= (1-indirimOrani);
        System.out.println("indirilmiş etiket fiyatı :" + etiketFiyati);
    }

    private static void  parametreliİndir(double etiketFiyati, double indirimOrani) {
       etiketFiyati*= (1-indirimOrani);
        System.out.println("indirilmiş etiket fiyatı :" + etiketFiyati);
    }
}
