package com.syntax.class23;

public interface Person {
    int a = 0;
    void eat();
}

interface Employee{
    void work();
}

interface SyntaxEmployee extends Employee,Person{
    void creatRepl();
}
class Asghar implements SyntaxEmployee,Employee{

    @Override
    public void eat() {
        System.out.println("Like to eat grilled Fish");
    }

    @Override
    public void work() {
        System.out.println("Teaches Bacth14 ");
    }

    @Override
    public void creatRepl() {
        System.out.println("Create easy Repls");
    }
}
