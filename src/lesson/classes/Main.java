package lesson.classes;

import lesson.classes.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getHuman().setAge(15);
        emp.getHuman().getAge();

    }
}
