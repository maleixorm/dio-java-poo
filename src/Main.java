package src;

public class Main {
    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {
        employee.setName("João");
        ((Manager)employee).setLogin("joao");
        ((Manager)employee).setPassword("123456");

        System.out.printf("======= %s =======/n", employee.getClass().getCanonicalName());
        System.out.println(employee.getName());
        System.out.println(((Manager)employee).getLogin());
        System.out.println(((Manager)employee).getPassword());
        System.out.println("=================");
    }
}