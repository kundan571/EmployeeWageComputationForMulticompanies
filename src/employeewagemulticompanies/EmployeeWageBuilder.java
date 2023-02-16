package employeewagemulticompanies;

public class EmployeeWageBuilder {
    static final int IS_FULL_TIME = 1;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int IS_PART_TIME = 2;

    public int employeeCheck() {
        int empCheck = (int) Math.floor((Math.random() * 10) % 3);
        return empCheck;
    }

    public int dailyWageOfEmployee(int empCheck) {
        int empHrs = 0;
        int totalWage = 0;
        switch (employeeCheck()) {
            //checking if part time or not
            case IS_PART_TIME:
                empHrs = 4;
                break;
            //checking if full time or not
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
        System.out.println("Employe Wage: " + employee.dailyWageOfEmployee(isPresent));
    }
}