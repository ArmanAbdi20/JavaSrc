package CodeChallengeLessons.Lesson02;

public class Q10_NestedTernary {
    public static void main(String[] args) {
       /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

        char finalNotu = 'A';



        String result = finalNotu=='A' ? "Gayet Basarili" :
                        finalNotu=='B' ? "Basarılı" :
                        finalNotu=='C' ? "Ha gayret" : "diğerleri";

        System.out.println("result = " + result);










































    }


}
