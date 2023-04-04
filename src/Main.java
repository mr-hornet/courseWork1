public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        Employee employee1 = new Employee("Саша", 1, 100);
        employeeBook.addNewEmployee(employee1);

        Employee employee2 = new Employee("Паша", 1, 200);
        employeeBook.addNewEmployee(employee2);

        Employee employee3 = new Employee("Маша", 2, 50);
        employeeBook.addNewEmployee(employee3);

        employeeBook.getListAll();

        System.out.println("Общие траты на ЗП = " + employeeBook.salaryCosts());

        System.out.println("Минимальная ЗП у " + employeeBook.minSalary());

        System.out.println("Максимальная ЗП у " + employeeBook.maxSalary());

        System.out.println("Средная ЗП = " + employeeBook.averageValueSalary());

        employeeBook.printFIO();

        employeeBook.changeSalary();

        System.out.println("Минимальная ЗП у " + employeeBook.minSalaryDepartment(1));

        System.out.println("Максимальная ЗП у " + employeeBook.maxSalaryDepartment(1));

        System.out.println("Общие траты на ЗП в отделе = " + employeeBook.salaryCostsDepartment(2));

        System.out.println("Средние траты на ЗП в отделе = " + employeeBook.averageValueSalaryDepartment(10));

        employeeBook.changeSalaryDepartment(2);

        employeeBook.printPersonDepartment(1);

        employeeBook.salaryLessNumber(150);

        employeeBook.salaryMoreNumber(150);

        employeeBook.deleteEmployee(2);

        employeeBook.changeEmployeeSalary("Паша");

        employeeBook.changeEmployeeDepartment("Паша");

    }
}