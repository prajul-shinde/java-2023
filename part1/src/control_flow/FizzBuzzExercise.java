package control_flow;

import java.util.Scanner;

public class FizzBuzzExercise {
    public static void main(String[] args) {
        //if divisible by 5 then fizz
        //divisible by 3 then buzz
        //divisible by both 5 and 3 then fizzbuzz
        //otherwise same number

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

         if((number%5==0)&& (number%3==0))
        System.out.print("FIZZBUZZ");
        else if(number % 5 == 0)
        System.out.print("FIZZ");
        else if(number % 3 == 0)
        System.out.print("BUZZ");
       
        else
        System.out.print(number);
        sc.close();
    }
    
}
