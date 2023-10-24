package classes;

public class Exercise1 {

    public static void main(String[] args) {
        var employee2 = new Employee(10000);

        var employee = new Employee(50000,20);
        int wage = employee.calculateWage(10);
        int wageWithNoExtraHours = employee.calculateWage();
        System.out.println(wage);
        System.out.println(wageWithNoExtraHours);
        Employee.printNumberOfEmployees();
    }

}
