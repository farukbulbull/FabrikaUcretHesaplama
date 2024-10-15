public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        }
        return this.salary * 0.03;
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - this.hireYear;

        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    @Override
    public String toString() {
        return "Employee Information:\n" +
               "Name: " + this.name + "\n" +
               "Salary: " + this.salary + "\n" +
               "Work Hours: " + this.workHours + "\n" +
               "Hire Year: " + this.hireYear + "\n" +
               "Tax: " + tax() + "\n" +
               "Bonus: " + bonus() + "\n" +
               "Raise Salary: " + raiseSalary() + "\n" +
               "Salary with Tax and Bonus: " + (this.salary - tax() + bonus() + raiseSalary());
    }

}
