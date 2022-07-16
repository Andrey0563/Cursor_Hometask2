import java.util.Random;

public class fourthTask {
    public static void main(String[] args) {
        Random random = new Random();

        int [] arr = new int[7];
        int max = arr[0];

        for (int i = 0; i<arr.length;i++){
            arr[i] = random.nextInt(50);
            System.out.println(arr[i]);

        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println("The largest number is: "+max);

    }
}
