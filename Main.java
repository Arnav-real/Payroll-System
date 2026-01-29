package Payroll_system;


public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Ayus",026,800000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Yathart", 054, 180, 1500);
        PartTimeEmployee emp4 = new PartTimeEmployee("Tanmay", 169, 200, 2000);
        FullTimeEmployee emp3 = new FullTimeEmployee("Shourya",666,60000);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);
        payrollSystem.addEmployee(emp4);

        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();
        System.out.println("\n----------------REMOVING SHOURYA----------------\n");
        payrollSystem.removeEmployee(666);
        payrollSystem.displayEmployees();
        
    }
}
