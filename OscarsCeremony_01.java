package BASIC.Additional_Problems_MIX.ExamPrepJuly21;

import java.util.Scanner;

public class OscarsCeremony_01 {                       // 100/100
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double figure = rent*0.70;
        double catering = figure*0.85;
        double voice =catering/2.0;

        double total = rent+figure+catering+voice;
        System.out.printf("%.2f", total);



    }
}
