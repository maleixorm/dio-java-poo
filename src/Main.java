package src;

public class Main {
    public static void main(String[] args) {
        var male = new Person();
        male.name = "João";
        male.age = 20;
        var female = new Person();
        female.name = "Maria";
        female.age = 40;
        System.out.printf("Homem -> Nome: %s | Idade: %d\n", male.name, male.age);
        System.out.printf("Mulher -> Nome: %s | Idade: %d\n", female.name, female.age);
    }
}