//first var

import java.util.Arrays;
import java.util.Random;
//
//public class seventhTask {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(50);
//            if (arr[i] % 2 == 0) {
//                System.out.println(arr[i]);
//            }
//        }
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0 && arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("The largest number is: " + max);
//
//    }
//}
////
////

//second var
public class seventhTask {
    public static void main(String[] args) {
        int[] arr = new int[]{-49, -22, -15, -4, -48, -35, -43, -23, -12, -22};
        boolean isEven = false;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] > max) {
                    max = arr[i];
                    isEven = true;
                }
            }
        }
        if (!isEven) {
            System.out.println("There is no one even number in array");
            System.exit(0);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The largest number is: " + max);

    }
}
