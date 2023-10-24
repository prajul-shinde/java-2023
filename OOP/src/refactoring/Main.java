package refactoring;

public class Main {

    public static void main(String[] args) {

        int principal = 0;
        float annualInterest = 0;
        byte period = 0;

        principal = (int) Console.readNumber("Principal ($1k - $1M): ", 1000, 1000_000);
        annualInterest = (float) Console.readNumber("Annual Interest: ", 1, 30);
        period = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, period);
        var report = new MortgageReport(calculator);
        
        report.printMortgage();
        report.printPaymentSchedule();

    }
}
