package ex04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        char charToCount;
        int charCounter;
        int uniChar;
        int maxElem;
        int maxUniChar = 0;

        Scanner scan = new Scanner(System.in);
        String scanStr = scan.nextLine();
        int [] uniCountArr = new int[65536];
        int [][] maxCharArr = new int[10][2];
        char[] charArr = scanStr.toCharArray();
        for (int i = 0; i < scanStr.length(); i++){
            charToCount = charArr[i];
            charCounter = 0;
            for (int j = 0; j < scanStr.length(); j++){
                if (charToCount == charArr[j])
                    charCounter++;
            }
            uniChar = charToCount;
            uniCountArr[uniChar] = charCounter;
            if (charCounter > 999)
                System.out.println("Error: you can't input more than 999 characters of the same letter.");
        }
        for (int j = 0; j < 10; j++) {
            maxElem = 0;
            for (int i = 0; i < uniCountArr.length; i++) {
                if (uniCountArr[i] > maxElem) {
                            maxElem = uniCountArr[i];
                            maxUniChar = i;
                }
            }
            uniCountArr[maxUniChar] = 0;
            maxCharArr[j][0] = maxUniChar;
            maxCharArr[j][1] = maxElem;
        }

        int strLvl = 12;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                if (maxCharArr[j][1] * 10 / maxCharArr[0][1] + 2 == strLvl)
                    System.out.print(maxCharArr[j][1] + "\t");
                if (maxCharArr[j][1] * 10 / maxCharArr[0][1] + 2 > strLvl)
                    System.out.print("#\t");
            }
            strLvl--;
            System.out.print("\n");
        }
        for (int[] ints : maxCharArr)
            System.out.print((char) ints[0] + "\t");
    }
}
