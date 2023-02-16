package employeewagemulticompanies;

public class EmployeeWageBuilder {
     static int IS_FULL_TIME = 1;
    public static int employeeCheck(){
        int empCheck = (int) Math.floor((Math.random() * 10) % 3);
        if (empCheck == IS_FULL_TIME){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }
        return empCheck;
    }
    public static void main(String[] args) {
        employeeCheck();
    }
}