package BASIC.Additional_Problems_MIX.ExamPrepJuly21;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double pointsFromAcadamy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        //double sum=0;

        for (int i = 1; i <= n; i++) {
            String nameAssess = scanner.nextLine();
            double pointsAssess = Double.parseDouble(scanner.nextLine());
            double pointsResult = (nameAssess.length() * pointsAssess) / 2;   //Точките - дължината на името на оценяващия умножено по точките, които дава делено на две.
            pointsFromAcadamy += pointsResult;          // points are added to the beginning points, given from Academy
                                                       // no need to declare "sum"
            if (pointsFromAcadamy > 1250.5) {
                break;  //Ако резултатът в някой момент надхвърли 1250.5 програмата трябва да прекъсне и да се отпечата
            }
        }
        if (pointsFromAcadamy >= 1250) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, pointsFromAcadamy);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!%n", actor, Math.abs(pointsFromAcadamy - 1250.5));
        }

    }
}
