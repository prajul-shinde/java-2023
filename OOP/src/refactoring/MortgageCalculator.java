package refactoring;

public class MortgageCalculator {

    private int principal;
    private float annualInterest;
    private byte period;
    private static final int PERCENTAGE = 100;
    private static final int MONTHS_IN_YEAR = 12;

    public MortgageCalculator(int principal, float annualInterest, byte period) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.period = period;
    }

    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        short totalNumberOfPayments = getTotalNumberOfPayments();
        return principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, totalNumberOfPayments))
                / ((Math.pow(1 + monthlyInterest, totalNumberOfPayments) - 1));
    }

    private float getMonthlyInterest() {
        float monthlyInterest = annualInterest / MortgageCalculator.PERCENTAGE / MortgageCalculator.MONTHS_IN_YEAR;
        return monthlyInterest;
    }

    public double calculateBalance(int month) {

        float monthlyInterest = getMonthlyInterest();
        short totalNumberOfPayments = getTotalNumberOfPayments();
        return principal *
                (Math.pow(1 + monthlyInterest, totalNumberOfPayments)
                        - Math.pow(1 + monthlyInterest, month))
                / (Math.pow(1 + monthlyInterest, totalNumberOfPayments) - 1);
    }

    private short getTotalNumberOfPayments() {
        short totalNumberOfPayments = (short) (period * MortgageCalculator.MONTHS_IN_YEAR);
        return totalNumberOfPayments;
    }

    public double[] getRemainingBalances() {
        double[] balances = new double[getTotalNumberOfPayments()];
        for (int numberOfPaymentsMade = 1; numberOfPaymentsMade <= balances.length; numberOfPaymentsMade++)
            balances[numberOfPaymentsMade - 1] = calculateBalance(numberOfPaymentsMade);
        return balances;
    }

}
