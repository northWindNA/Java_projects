package ex01;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int iterations = 0;
        boolean flag = false;

        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        if (number < 2)
            System.out.println("IllegalArgument");
        else {
            for (long i = 2; i*i <= number; i++) {
                iterations++;
                if (number % i == 0) {
                    System.out.println("false " + iterations);
                    flag = true;
                    break;
                }
            }
            if (!flag){
                iterations++;
                System.out.println("true " + iterations);
            }
        }
    }
}
