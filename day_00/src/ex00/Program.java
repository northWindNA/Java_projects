package ex00;

public class Program {
    public static void main(String[] args) {
        int number = 479598;
        int digit;
        int sum = 0;

        digit = number % 10;
        number = number / 10;
        sum += digit;
        digit = number % 10;
        number = number / 10;
        sum += digit;
        digit = number % 10;
        number = number / 10;
        sum += digit;
        digit = number % 10;
        number = number / 10;
        sum += digit;
        digit = number % 10;
        number = number / 10;
        sum += digit;
        digit = number % 10;
        number = number / 10;
        sum += digit;
        System.out.println(sum);
    }
}
