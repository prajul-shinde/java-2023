package Types;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static final int MONTHS_IN_YEAR = 12;
    public static final int PERCENT = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = sc.nextInt();

        System.out.print("Annual Interest rate: ");
        float annualInterestRate = sc.nextFloat();

        System.out.print("Period (Years): ");
        int period = sc.nextInt();

        // calculating based on input
        float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        double totalNumberOfPayments = period * MONTHS_IN_YEAR;

        // calculate the mortgage value
        double mortgage =  principal * 
                                (monthlyInterest*Math.pow(1+ monthlyInterest, totalNumberOfPayments))
                                /(Math.pow(1+ monthlyInterest, totalNumberOfPayments)-1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        System.out.print("Mortgage: " + currency.format(mortgage));

        sc.close();
    }

}
