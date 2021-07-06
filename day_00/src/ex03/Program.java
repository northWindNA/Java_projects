package ex03;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        long minValues = 0;
        long reversedMinValues = 0;
        int numWeeks = 0;
        long minWeekVal;
        int min;
        int tmp;

        for (int i = 1; i < 19; i++)
        {
            Scanner scan = new Scanner(System.in);
            String weekNum = scan.nextLine();
            if (weekNum.equals("42"))
                break;
            if (weekNum.equals("Week " + i)){
                min = 10;
                for (int y = 0; y < 5; y++){
                    if (!scan.hasNextInt()){
                        System.err.println("Error: non-decimal input.");
                        return;
                    }
                    tmp = scan.nextInt();
                    if (tmp >= 1 && tmp <= 9) {
                        if (tmp < min)
                            min = tmp;
                    }
                    else {
                        System.err.println("Error: bad grade.");
                        return;
                    }
                }
                minValues = minValues * 10 + min;
                numWeeks++;
            }
            else {
                System.err.println("Error: IllegalArgument.");
                return;
            }
        }
        while(minValues != 0) {
            long digit = minValues % 10;
            reversedMinValues = reversedMinValues * 10 + digit;
            minValues /= 10;
        }
        for (int z = 0; z < numWeeks; z++){
            System.out.print("Week ");
            System.out.print(z + 1);
            System.out.print(" ");
            minWeekVal = reversedMinValues % 10;
            reversedMinValues = reversedMinValues / 10;
            for (int n = 0; n < minWeekVal; n++)
                System.out.print("=");
            System.out.print(">\n");
        }
    }
}
