package BASIC.Additional_Problems_MIX.ExamPrepJuly21;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());   // 2345
        int end = Integer.parseInt(scanner.nextLine());     // 6789

        int firstStart = start / 1000;         // 2
        int secondStart = (start / 100) % 10;  // 3
        int thirdStart = (start / 10) % 10;    // 4
        int fourthStart = start % 10;          // 5

        int firstEnd = end / 1000;            // 6
        int secondEnd = (end / 100) % 10;     // 7
        int thirdEnd = (end / 10) % 10;       // 8
        int fourthEnd = end % 10;             // 9

        for (int i = firstStart; i <= firstEnd; i++) {
            for (int j = secondStart; j <= secondEnd; j++) {
                for (int k = thirdStart; k <= thirdEnd; k++) {
                    for (int l = fourthStart; l <= fourthEnd; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                            //System.out.print(" " + i + j + k + l + " ");
                        }
                    }
                }
            }
        }
        System.out.println();
    }
}
