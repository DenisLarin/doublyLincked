package ru.larin;

import java.util.Scanner;

/**
 * Created by mrden on 24.10.2016.
 */
public class Person {
    private String name;
    private int age;
    private Scanner scanner;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(){
        setName();
        setAge();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        this.name = scanner.nextLine();
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        this.age = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
