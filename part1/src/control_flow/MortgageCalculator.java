package control_flow;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static final int PERCENTAGE = 100;
    public static final int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal;
        float annualInterest;
        int period;

        while (true) {
            System.out.print("Principal ($1k - $1M): ");
             principal = sc.nextInt();
            if (principal >= 1000 && principal <= 1000_000)
                break;
            else {
                System.out.println("Enter Number between 1000 and 1000_000");
                continue;
            }

        }

        while (true) {
            System.out.print("Annual Interest: ");
             annualInterest = sc.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30)
                break;
            else {
                System.out.println("Enter value greater than 0 but less than or equal to 30");
                continue;
            }
        }
        while (true) {
            System.out.print("Period (Years): ");
             period = sc.nextInt();
            if (period > 0 && period <= 30)
                break;
            else {
                System.out.println("Enter value greater than 0 but less than or equal to 30");
                continue;
            }
        }

        float monthlyInterest = annualInterest / PERCENTAGE / MONTHS_IN_YEAR;
        int totalNumberOfPayments = period * MONTHS_IN_YEAR;

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, totalNumberOfPayments))
                / ((Math.pow(1 + monthlyInterest, totalNumberOfPayments) - 1));

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
