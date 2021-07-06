package ex02;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int count = 0;
        long dig;
        while(true)
        {
            Scanner scan = new Scanner(System.in);
            long number = scan.nextLong();
            if (number == 42)
                break;
            dig = number;
            long num_length = 0;
            long tmp = 1;
            while(tmp <= number) {
                num_length++;
                tmp *= 10;
            }

            long digit;
            long sum = 0;
            for (long i = 0; i < num_length; i++) {
                digit = number % 10;
                number = number / 10;
                sum += digit;
            }

            long del;
            boolean flag = false;
            del = sum / 2;
            for (long i = 2; i <= del; i++) {
                if (sum % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                if (dig == -1 || dig == 0 || dig == 1)
                    continue;
                else
                    count++;
            }
        }
        System.out.println("Count of coffee-request - " + count);
    }
}
