package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task_20_Arrayboth_Ends {

    public static void main(String[] args) {

         /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..


        int sayiArr []= {1, 2, 3, 4};
        // int yeniArr[]=new int[2];

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));
        System.out.println("Arrays.toString(sayiArr).replace(\"1,2,3,4\", \"1\") = " + Arrays.toString(sayiArr).replace("1,2,3,4", "1"));


        // String sayiArr2  = Arrays.toString(sayiArr).substring(0)+Arrays.toString(sayiArr).substring(sayiArr.length-1);


    //    System.out.println("sayiArr2 = " + sayiArr2);
      

        
    }
}
