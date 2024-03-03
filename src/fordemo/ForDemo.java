package fordemo;

import java.util.Arrays;

public class ForDemo {
    public static void main(String[] args) {

        int array[] = {3, 4, 1, 5};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }

    }


//        for(int i=0;i<=100;i++){
    //   for (int i = 10; i <= 100; i += 10) {
//            System.out.println("count" + "=" + i);
//        }
    }


