package BASIC.Additional_Problems_MIX.ExamPrepApril19_6th;

import java.util.Scanner;

public class CinemaTickets_06_Difficult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int countStudent = 0;
        int countStandard = 0;
        int countKid = 0;
        int currentMovieCount = 0;    // counter per Film; if declared after 1st while-> no need to Zero it in the end

        while (!movieName.equals("Finish")) {  //Трябва да прочетем местата след влизането в първия while, защото също така трябва да можем да ги прочетем повече от веднъж
            int freeSeats = Integer.parseInt(scanner.nextLine());

            String movieType = ""; //("student", "standard", "kid")

            while (!movieType.equals("End") && currentMovieCount < freeSeats) { //// without ..<.. (not <=) is not printing the 2nd film...
                movieType = scanner.nextLine();
                if (movieType.equals("student")) {
                    countStudent++;
                    currentMovieCount++;

                } else if (movieType.equals("standard")) {
                    countStandard++;
                    currentMovieCount++;

                } else if (movieType.equals("kid")) {
                    countKid++;
                    currentMovieCount++;
                }
            }
            double occupied = currentMovieCount * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, occupied);
            currentMovieCount = 0;    // !!! otherwise not reading all after the "movie names"

            movieName = scanner.nextLine();
        }
        int allTickets = countStudent + countStandard + countKid;

        double studentPercent = countStudent * 1.0 / allTickets * 100;
        double standardPercent = countStandard * 1.0 / allTickets * 100;
        double kidPercent = countKid * 1.0 / allTickets * 100;

        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", studentPercent);
        System.out.printf("%.2f%% standard tickets.%n", standardPercent);
        System.out.printf("%.2f%% kids tickets.", kidPercent);


    }
}
