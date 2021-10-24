package BASIC.Additional_Problems_MIX.ExamPrepJuly21;

import java.util.Scanner;

public class WorlsSnookerChampionship {
    public static void main(String[] args) {               // 80/100
        Scanner scanner = new Scanner(System.in);

        String typeGame = scanner.nextLine();             // "Quarter final ”, “Semi final” или “Final”
        String typeTicket = scanner.nextLine();         //“Standard”, “Premium” или “VIP”
        int ticketCount = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();            //символ – 'Y' (да) или 'N' (не)

        double ticketPrice = 0;
        double sum = 0;

        switch (typeTicket) {
            case "Standard":
                if (typeGame.equals("Quarter final")) {
                    ticketPrice = 55.50;
                } else if (typeGame.equals("Semi final")) {
                    ticketPrice = 75.88;
                } else if (typeGame.equals("Final")) {
                    ticketPrice = 110.10;
                }
                break;
            case "Premium":
                if (typeGame.equals("Quarter final")) {
                    ticketPrice = 105.20;
                } else if (typeGame.equals("Semi final")) {
                    ticketPrice = 125.22;
                } else if (typeGame.equals("Final")) {
                    ticketPrice = 160.66;
                }
                break;
            case "VIP":
                if (typeGame.equals("Quarter final")) {
                    ticketPrice = 118.90;
                } else if (typeGame.equals("Semi final")) {
                    ticketPrice = 300.40;
                } else if (typeGame.equals("Final")) {
                    ticketPrice = 400;
                }
                break;
        }
        sum = ticketCount * ticketPrice;
        boolean freePicture = false;

        if (sum >= 4000) {
            sum = sum * 0.75;
            freePicture = true;
        } else if (sum >= 2500) {
            sum = sum * 0.90;
            freePicture = false;
        }
        if (symbol.equals("Y") && !freePicture) {    // && sum<4000
            sum += ticketCount * 40;         //9 билета по 40 лири за снимка: 360 лири. , not 40 in total
        }
        System.out.printf("%.2f", sum);

    }
}
