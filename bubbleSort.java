// import java.util.Scanner;
// public class bubbleSort {
//     public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//     //    int num = input.nextInt();
//        int number[] = {2,5,4,3,78};
//         for (int i = 0; i < number.length-1; i++) {
//             if (number[i]>number[i+1]) {
//                 int temp = number[i];
//                 number[i]= number[i+1];
//                 number[i+1]= temp;
//             }
//         }
//         for (int j = 0; j < number.length; j++) {
//             System.out.println(number[j]);
            
//         }
//         input.close();
//     }
// }

/**
 * bubbleSort
 */
/**
 * bubbleSort
 public class bubbleSort {
     
     public static void main(String[] args) {
         int factorial = 1;
         int num = 5;
         for (int i = num; i >= 1; i--) {
             factorial = factorial*i;
            }
            System.out.println(factorial);
    }
}
            */
/**
 * bubbleSort
 */
public class bubbleSort {
    public static void selectionSort(int num[]) {
        for (int i = 0; i < num.length-1; i++) {
          int min_value = i;
            for (int j = i+1; j < num.length; j++) {
                if (num[min_value]>num[j]) {
                    min_value=j;
                }
            }
            int temp = num[i];
            num[i] = num[min_value];
            num[min_value] = temp;
        }
    }

    public static void printingArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={3,1,2,6,7};

        selectionSort(arr);
        printingArray(arr);
    }
}