package BASIC.Additional_Problems_MIX.ExamPrepApril19_6th;

import java.util.Scanner;

public class CinemaVoucher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucher = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();   // film or product
        int countTicket = 0;
        int countProduct = 0;
        int sum = 0;

        while (!command.equals("End")) {
            //String purchase = scanner.nextLine();   // not needed!!!
            if (command.length() > 8) {
                //int check = command.codePointAt(0)+command.codePointAt(1);  // codePointAt(0) = charAt(0)
                int check = command.charAt(0) + command.charAt(1);
                sum += check;
            } else {
                int check = command.codePointAt(0);
                sum += check;
            }
            if (sum > voucher) {
                break;
            }
            if (command.length() > 8) {     //count tickets & products after "break", as otherwise!!!
                countTicket++;            // countProduct are increased with 1 in the final print !!!
            } else {
                countProduct++;
            }
            command = scanner.nextLine();
        }
        System.out.println(countTicket);
        System.out.println(countProduct);

    }
}
