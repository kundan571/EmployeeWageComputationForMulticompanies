package employeewagemulticompanies;

public class EmployeeWageBuilder {
    static final int IS_FULL_TIME = 1;
    static final int EMP_RATE_PER_HOUR = 20;
    public int employeeCheck(){
        int empCheck = (int) Math.floor((Math.random() * 10) % 2);
        return empCheck;
    }
    public int dailyWageOfEmployee(int empCheck){
        int empHrs = 0;
        int totalWage = 0;
        //checking if full time or not
        switch (employeeCheck()) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        totalWage = empHrs * EMP_RATE_PER_HOUR;
        return totalWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageBuilder employee = new EmployeeWageBuilder();
        int isPresent = employee.employeeCheck();
        System.out.println(employee.dailyWageOfEmployee(isPresent));
    }
}