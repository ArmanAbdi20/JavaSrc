package J13_ArrayList.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {

        /* TASK :
         * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
         * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
         */

        ArrayList<Integer> arrayList = new ArrayList<Integer>(List.of(3, 5, 1, 2, 7, 9, 2, 3, 5, 7 ));
        ardışıkTopla(arrayList);

    }

    private static void ardışıkTopla(ArrayList<Integer> sayiList) {
        ArrayList<Integer> result =new ArrayList<>();
        for (int i = 0; i < sayiList.size(); i++) {
            sayiList.subList(i,i+1);



        }
    }
}
