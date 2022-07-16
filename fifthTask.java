import java.util.Random;

public class fifthTask {
    public static void main(String[] args) {
        Random rand = new Random();

        int [] arr = new int[15];
        int min = arr.length;

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(50);
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The lessees number is: "+min);



    }
}
