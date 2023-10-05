import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 1;
        while (sum != 0){
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            sum = num1 + num2;
            System.out.println(sum);
        }
    }
}
