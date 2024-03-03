package fordemo;

public class SelectionSort {
        public static void main(String[] args) {
            int arr[] = {64, 25, 12, 22, 11};
            System.out.println("Original array:"+arr);
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                System.out.println("Sorted array using Selection Sort:"+arr[i]);
            }


        }


//        public static void printArray(int[] arr) {
//            for (int value : arr) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }
    }


