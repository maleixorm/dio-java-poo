package src;

public class Main {
    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {
        System.out.printf("======= %s =======\n", employee.getClass().getCanonicalName());
        switch (employee) {
            case Manager manager -> {
                manager.setCode("123");
                manager.setName("João");
                manager.setSalary(5000);
                manager.setCommission(1200);
                manager.setLogin("joao");
                manager.setPassword("123456");

                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getSalary());
                System.out.println(manager.getCommission());
            }
            case Salesman salesman -> {
                salesman.setCode("124");
                salesman.setName("Maria");
                salesman.setSalary(3000);
                salesman.setPercentPerSold(10);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPerSold());
            }
        }
        System.out.println("==================");
    }
}