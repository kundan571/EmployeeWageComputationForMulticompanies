package employeewagemulticompanies;

public class EmployeeWageBuilder extends Companies {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageBuilder tataGroup = new EmployeeWageBuilder();
        EmployeeWageBuilder reliance = new EmployeeWageBuilder();
        System.out.println("Total wage tata group: " + tataGroup.dailyWageOfEmployee(95, 25, 20));
        System.out.println("Total wage Reliance: " + reliance.dailyWageOfEmployee(90, 24, 30));
    }
}