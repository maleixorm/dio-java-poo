package src;

public class Main {
    public static void main(String[] args) {
        var male = new Person("João", 20);
        var female = new Person("Maria", 30);
        System.out.printf("Homem --> Nome: %s | Idade: %d\n", male.getName(), male.getAge());
        System.out.printf("Mulher --> Nome: %s | Idade: %d\n", female.getName(), female.getAge());

        Employee employee = new Employee();
        Manager manager = new Manager();
        manager.setName("João");
        manager.setLogin("joao");
        manager.setPassword("123456");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
    }
}