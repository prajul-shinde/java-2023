package Lambdas;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> getRandom = ()-> Math.random();
        Double random = getRandom.get();
        System.out.println(random);
    }
    
}
