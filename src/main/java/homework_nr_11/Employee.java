package homework_nr_11;

import java.util.function.Predicate;

public class Employee {

    private String name;
    private String surname;
    private int age;
    private String department;

    public Employee(String name, String surname, int age, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    static void testEmployee (Employee e, Predicate<Employee> testMethod){
        String result = String.valueOf(testMethod.test(e));
        System.out.println(result);

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Tom", "Mot", 23, "Software Engineering");
        Employee emp2 = new Employee("Jack", "Kaj", 30, "Management");
        Employee emp3 = new Employee("Alex", "Lib", 45, "Finances");

        Employee.testEmployee(emp1, EmployeePredicates.worksInSoftwareEngineering);
        Employee.testEmployee(emp1, EmployeePredicates.olderThan20Years);
        Employee.testEmployee(emp1, EmployeePredicates.nameStartsWithLetter);
        System.out.println("-------------");

        Employee.testEmployee(emp2, EmployeePredicates.worksInSoftwareEngineering);
        Employee.testEmployee(emp2, EmployeePredicates.olderThan20Years);
        Employee.testEmployee(emp2, EmployeePredicates.nameStartsWithLetter);
        System.out.println("-------------");

        Employee.testEmployee(emp3, EmployeePredicates.worksInSoftwareEngineering);
        Employee.testEmployee(emp3, EmployeePredicates.olderThan20Years);
        Employee.testEmployee(emp3, EmployeePredicates.nameStartsWithLetter);

    }
}
