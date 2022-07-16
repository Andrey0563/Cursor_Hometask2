import java.util.Random;

public class sixthTask {
    public static void main(String[] args) {
            Random random = new Random();

            int [] arr = new int[7];
            int sum = 0;
            int average;

            for (int i = 0; i<arr.length;i++){
                arr[i] = random.nextInt(50);
                System.out.println(arr[i]);

            }
            for (int i = 0; i < arr.length; i++){
                sum+=arr[i];

            }
        average = sum / arr.length;
        System.out.println("Sum of all array numbers: "+sum);
        System.out.println("Average: "+ average);

            }
//            System.out.println("The largest number is: "+sum);




}
