package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task19 {

    public static void main(String[] args) {

        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz.
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }


        int arr1[][] = { {1,2}, {3,4,5}, {6} };
        int arr2[][] = { {7,8,9}, {10,11}, {12}};


        for (int a[]:arr1) {
            for (int b:a) {
                System.out.print(b+" ");
            }
            System.out.println();
        }


        for (int a[] : arr2) {
            for (int b:a) {
                System.out.print(b+" ");
            }
            System.out.println();
        }

//https://tamweblik.blogspot.com/2018/08/java-kodlama-ornekleri-27-iki-boyutlu.html

    }
}
