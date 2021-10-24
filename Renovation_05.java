package BASIC.Additional_Problems_MIX.ExamPrepJuly21;

import java.util.Scanner;

public class Renovation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double totalArea = height * width * 4;
        double areaAfterPercent = Math.ceil(totalArea - (totalArea * percent / 100));  //Math.ceil

        String command = scanner.nextLine();

        while (!command.equals("Tired!")) {
            int litresPaint = Integer.parseInt(command);
            areaAfterPercent -= litresPaint;
                                                  //Площта за боядисване да бъде закръглена нагоре
            if (areaAfterPercent <=0) {
               break;
            }
            command = scanner.nextLine();
        }
        if (areaAfterPercent==0){
            System.out.println("All walls are painted! Great job, Pesho!");
        }
        else if (command.equals("Tired!")){
            System.out.printf("%.0f quadratic m left.", areaAfterPercent);
        } else {
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(areaAfterPercent));
        }





    }
}
