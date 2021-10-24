package BASIC.Additional_Problems_MIX.ExamPrepApril19_6th;

import java.util.Scanner;

public class MovieRating2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double max =-2000000000.00;
        double min = 20000000000.00;
        String bestMovie="";
        String worstMovie="";
        double sum=0;

        for (int i = 1; i <=count ; i++) {
            String name = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            sum+=rating;

            if (rating>max){
                max=rating;
                bestMovie=name;
            }
            if (rating<min){
                min=rating;
                worstMovie=name;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n",bestMovie,max);
        System.out.printf("%s is with lowest rating: %.1f%n",worstMovie,min);
        System.out.printf("Average rating: %.1f",sum/count);


    }
}
