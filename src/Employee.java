// Maaş təyini və validation-u olan işçi class-ı

public class Employee {

    public static class EmployeeInfo {
        private String name;
        private String department;
        private double salary;

        public EmployeeInfo(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            if (salary < 400) {
                System.out.println("Xəbərdarlıq: Salary 400 AZN-dən aşağı ola bilməz!");
            } else {
                this.salary = salary;
            }
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if (salary < 400) {
                System.out.println("Xəbərdarlıq: Salary 400 AZN-dən aşağı ola bilməz!");
            } else {
                this.salary = salary;
            }
        }

        public void raiseSalary(double percent) {
            this.salary = this.salary + (this.salary * percent / 100);
        }
    }
    public static void main(String[] args) {

        EmployeeInfo emp1 = new EmployeeInfo("Ləman", "İT", 1500);
        EmployeeInfo emp2 = new EmployeeInfo("Zəhra", "HR", 800);
        EmployeeInfo emp3 = new EmployeeInfo("Fatimə", "Marketinq", 350);

        System.out.println(emp1.getName() + " (" + emp1.getDepartment() + "),   Maaş: " + emp1.getSalary() + " AZN");
        System.out.println(emp2.getName() + " (" + emp2.getDepartment() + "),   Maaş: " + emp2.getSalary() + " AZN");
        System.out.println(emp3.getName() + " (" + emp3.getDepartment() + "),   Maaş: " + emp3.getSalary() + " AZN");

        System.out.println();
        emp1.raiseSalary(15);
        System.out.println("Ləmanın yeni maaşı: " + emp1.getSalary() + " AZN");
        System.out.println();
        emp2.setSalary(300);
        System.out.println("Zəhranın cari maaşı: " + emp2.getSalary() + " AZN");
    }
}
