package homework_nr_11;

import java.util.function.Predicate;

public class EmployeePredicates{

    public static Predicate<Employee> worksInSoftwareEngineering = employee -> "Software Engineering".equals(employee.getDepartment());
    public static Predicate<Employee> olderThan20Years = employee -> employee.getAge() > 20;
    public static Predicate<Employee> nameStartsWithLetter = employee -> employee.getName().startsWith("A");



}
