package J12_Arrays.Tasks;

public class Task19 {

    public static void main(String[] args) {

        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }


        int arr1[][] = { {1,2}, {3,4,5}, {6} };
        int arr2[][] = { {7,8,9}, {10,11}, {12}};
            int toplam =0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
            }
        }

        for (int k = 0; k < arr2.length; k++) {
            for (int l = 0; l < arr2[k].length; l++) {
                System.out.println(arr2[k][l]);
            }
        }

           if (arr1[0][0]!=arr2[0][0]) {}

    }
}
