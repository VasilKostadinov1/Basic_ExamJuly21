package BASIC.Additional_Problems_MIX.ExamPrepJuly21;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSec = Double.parseDouble(scanner.nextLine());
        double distanceMetres = Double.parseDouble(scanner.nextLine());
        double timeInSecPer1Meter = Double.parseDouble(scanner.nextLine());

        double totalTime = (distanceMetres*timeInSecPer1Meter);
        double timeAdd50Metres = Math.floor((distanceMetres/50))*30;  // !!! brackets of Math.floor DO NOT include 30 sec

        double totalFinal = (totalTime+timeAdd50Metres);

        if (totalFinal<recordSec){
            System.out.printf("Yes! The new record is %.2f seconds.", totalFinal);
        }else {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(totalFinal-recordSec));
        }

    }


}
