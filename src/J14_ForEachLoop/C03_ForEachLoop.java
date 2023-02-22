package J14_ForEachLoop;

public class C03_ForEachLoop {

    public static void main(String[] args) {

        // task-> iki string array eleamanlarının ortak olmasını kontrol eden code create ediniz..with for-each
        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};

        boolean ortak=false;
        for (String a  :arr1) {
            for (String b: arr2) {
                a.equals(b); 
                ortak=true;
            }

        }

        System.out.println("ortak = " + ortak);

    }
}
