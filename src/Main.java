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

        employeeBook.salaryCosts();

        employeeBook.minSalary();

        employeeBook.maxSalary();

        employeeBook.averageValueSalary();

        employeeBook.getFIO();

        employeeBook.changeSalary();

        employeeBook.minSalaryDepartment(1);

        employeeBook.maxSalaryDepartment(1);

        employeeBook.salaryCostsDepartment(2);

        employeeBook.averageValueSalaryDepartment(1);

        employeeBook.changeSalaryDepartment(2);

        employeeBook.getPersonDepartment(1);

        employeeBook.salaryLessNumber(150);

        employeeBook.salaryMoreNumber(150);

        employeeBook.deleteEmployee(2);

        employeeBook.changeEmployeeSalary("Паша");

        employeeBook.changeEmployeeDepartment("Паша");

    }
}