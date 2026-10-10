package org.example;
public class Persona {
    private String name;
    private int age;
    public Persona(String name, int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void stampa(){
        System.out.println(getName()+", "+getAge()+" anni");
    }
    public boolean isMaggiorenne() {
        return age >= 18;
    }
}