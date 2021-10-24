package BASIC.Additional_Problems_MIX.ExamPrepApril19_6th;

import java.util.Scanner;

public class MovieRating_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int films = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        String bestFilm = "";
        String worstFilm = "";

        for (int i = 1; i <= films; i++) {
            String name = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());  // ex. 7.8 !!! should be double, or throws exception

            sum += rating;
            if (rating > max) {
                max = rating;
                bestFilm = name;
            }
            if (rating < min) {
                min = rating;
                worstFilm = name;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", bestFilm, (double) max);
        System.out.printf("%s is with lowest rating: %.1f%n", worstFilm, (double) min);

        double average=sum/films;
        System.out.printf("Average rating: %.1f",average);

    }
}
