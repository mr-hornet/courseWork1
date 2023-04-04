import java.util.Scanner;

public class EmployeeBook {
    Scanner scanner = new Scanner(System.in);

    private final Employee[] employees = new Employee[10];

    public void getListAll() {

        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            System.out.println(e);
        }
    }

    public int salaryCosts() {
        int total = 0;
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            total = total + e.getSalary();
        }
        return total;
    }

    public Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getSalary() < min) {
                min = e.getSalary();
                employee = e;
            }
        }
        return employee;
    }

    public Employee maxSalary() {
        int max = 0;
        Employee employee = null;
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getSalary() > max) {
                max = e.getSalary();
                employee = e;
            }
        }
        return employee;
    }

    public double averageValueSalary() {
        int total = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            total = total + e.getSalary();
            count++;
        }
        return (double) total / count;
    }

    public void printFIO() {

        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            System.out.println(e.getFio());
        }
    }

    public void changeSalary() {
        System.out.println("На какую величину (%) увеличить зарплату?");
        int percent = scanner.nextInt();
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            double result = e.getSalary() + (e.getSalary() / 100.0 * percent);
            e.setSalary((int) result);
            System.out.println("Зарпалата " + e.getFio() + " теперь " + e.getSalary());
        }
    }

    public Employee minSalaryDepartment(int department) {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department && e.getSalary() < min) {
                min = e.getSalary();
                employee = e;
            }
        }
        return employee;
    }

    public Employee maxSalaryDepartment(int department) {
        int max = 0;
        Employee employee = null;
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department && e.getSalary() > max) {
                max = e.getSalary();
                employee = e;
            }
        }
        return employee;
    }

    public int salaryCostsDepartment(int department) {
        int total = 0;
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department) {
                total = total + e.getSalary();
            }
        }
        return total;
    }

    public double averageValueSalaryDepartment(int department) {
        int total = 0;
        int count = 0;
        boolean haveDepartment = false;
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department) {
                haveDepartment = true;
                total = total + e.getSalary();
                count++;
            }
            if (!haveDepartment) {
                System.out.println("Такого департамента нет");
                return 0.0;
            }
        }
        return (double) total / count;
    }

    public void changeSalaryDepartment(int department) {
        System.out.println("На какую величину (%) увеличить зарплату?");
        int percent = scanner.nextInt();
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department) {
                double result = e.getSalary() + (e.getSalary() / 100.0 * percent);
                e.setSalary((int) result);
                System.out.println("Зарплата " + e.getFio() + " теперь " + e.getSalary());
            }
        }
    }

    public void printPersonDepartment(int department) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department) {
                System.out.println("ФИО - " + e.getFio() + ", зарплата - " + e.getSalary() + ", ID - " + e.getId());
            }
        }
    }

    public void salaryLessNumber(int number) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getSalary() < number) {
                System.out.println("ID - " + e.getId() + ", ФИО - " + e.getFio() + ", зарплата - " + e.getSalary());
            }
        }
    }

    public void salaryMoreNumber(int number) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getSalary() >= number) {
                System.out.println("ID - " + e.getId() + ", ФИО - " + e.getFio() + ", зарплата - " + e.getSalary());
            }
        }
    }

    public void addNewEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void deleteEmployee(int id) {
        boolean haveEmployee = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getId() == id) {
                employees[i] = null;
                System.out.println("Сотрудник с ID " + id + " успешно удален");
                haveEmployee = true;
                break;
            }
        }
        if (!haveEmployee) {
            System.out.println("Такого сотрудника нет");
        }
    }

    public void changeEmployeeSalary(String fio) {
        boolean haveEmployee = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getFio().equals(fio)) {
                System.out.println("Сотрудник найден! Какую зарплату установить?");
                int newSalary = scanner.nextInt();
                employees[i].setSalary(newSalary);
                haveEmployee = true;
                System.out.println("Зарплата " + employees[i].getFio() + " = " + employees[i].getSalary());
            }
        }
        if (!haveEmployee) {
            System.out.println("Такого сотрудника нет");
        }
    }

    public void changeEmployeeDepartment(String fio) {
        boolean haveEmployee = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getFio().equals(fio)) {
                System.out.println("Сотрудник найден! В какой отдел его перевести?");
                int newDepartment = scanner.nextInt();
                employees[i].setDepartment(newDepartment);
                haveEmployee = true;
                System.out.println(employees[i].getFio() + " переведен в отдел № - " + employees[i].getDepartment());
            }
        }
        if (!haveEmployee) {
            System.out.println("Такого сотрудника нет");
        }
    }

}
