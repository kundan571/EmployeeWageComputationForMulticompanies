package employeewagemulticompanies;

public class Companies {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    // Random checking employee attendance
    public static int employeeCheck() {
        int empCheck = (int) Math.floor((Math.random() * 10) % 3);
        return empCheck;
    }

    public int dailyWageOfEmployee(int workingHours, int workingDays, int ratePerHour) {
        int empHrs = 0;
        int totalHrs = 0;
        int totalWage = 0;
        int totalWorkingDays = 0;
        while (totalWorkingDays < workingDays && totalWorkingDays < workingHours) {
            totalWorkingDays++;
            switch (employeeCheck()) {
                //checking if part-time or not
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
            totalHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " " + "Emp hr: " + totalHrs);
        }
        totalWage = totalHrs * ratePerHour;
        return totalWage;
    }

}

