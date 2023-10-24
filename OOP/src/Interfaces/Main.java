package Interfaces;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        //constructo injection
        TaxReport report = new TaxReport(calculator);
        report.show();

        //setter injection. we can change dependency throughout lifetime of program.
        report.setCalculator(new TaxCalculator2019());
        report.show();

        //method injection
        report.showMethodInjection(new TaxCalculator2019());
    }
}
