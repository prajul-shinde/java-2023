package Interfaces;

public class TaxReport{

    private TaxCalculator calculator;


    //constructor injection
    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }

    public void show(){
        double tax= calculator.calculateTax();
        System.out.println(tax);
    }

    
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

     public void showMethodInjection(TaxCalculator calculator){
        double tax= calculator.calculateTax();
        System.out.println(tax);
    }
    
}
