import java.util.Random;

public class thirdTask {
    public static void main(String[] args) {
        char[] options = {'F','Z','P','E','N','T','L','C','D','O'};
        char[] result = new char[10];
        Random r=new Random();
        System.out.println("The list of char symbols:");
        for(int i=0;i<result.length;i++){
            result[i]=options[r.nextInt(options.length)];
            System.out.println(result[i]);
        }

    }
}
