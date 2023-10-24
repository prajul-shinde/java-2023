package refactoring;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCalculator calculator;
    private NumberFormat currency;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        this.currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments : " + currency.format(mortgage));

    }

    public void printPaymentSchedule() {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for (double remainingBalance : calculator.getRemainingBalances())
            System.out.println(currency.format(remainingBalance));
    }

}
