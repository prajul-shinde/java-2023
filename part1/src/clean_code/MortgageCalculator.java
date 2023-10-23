package clean_code;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static final int PERCENTAGE = 100;
    public static final int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {

        int principal = 0;
        float annualInterest = 0;
        byte period = 0;

        principal = (int) readNumber("Principal ($1k - $1M): ", 1000, 1000_000);
        annualInterest = (float) readNumber("Annual Interest: ", 1, 30);
        period = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, period);

        System.out.println("MORTGAGE");
        System.out.println("--------");

        System.out.println("Monthly Payments : " + NumberFormat.getCurrencyInstance().format(mortgage));

        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        printPaymentSchedule()

    }

    private static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateMortgage(int principal, float annualInterest, byte period) {

        float monthlyInterest = annualInterest / PERCENTAGE / MONTHS_IN_YEAR;
        short totalNumberOfPayments = (short) (period * MONTHS_IN_YEAR);
        return principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, totalNumberOfPayments))
                / ((Math.pow(1 + monthlyInterest, totalNumberOfPayments) - 1));
    }

    public static double calculateBalance(int principal, float annualInterest, short period, int month) {

        float monthlyInterest = annualInterest / PERCENTAGE / MONTHS_IN_YEAR;
        short totalNumberOfPayments = (short) (period * MONTHS_IN_YEAR);
        return principal *
                (Math.pow(1 + monthlyInterest, totalNumberOfPayments)
                        - Math.pow(1 + monthlyInterest, month))
                / (Math.pow(1 + monthlyInterest, totalNumberOfPayments) - 1);
    }

    public static void printPaymentSchedule(int principal, float annualInterest, short period) {

        for (int numberOfPaymentsMade = 1; numberOfPaymentsMade <= period * MONTHS_IN_YEAR; numberOfPaymentsMade++) {

            double remainingBalance = calculateBalance(principal, annualInterest, period, numberOfPaymentsMade);
            System.out.println(NumberFormat.getCurrencyInstance().format(remainingBalance));
            
        }
    }
}
