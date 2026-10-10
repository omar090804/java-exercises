package org.example;

public class TestPersona {
    public static void main(String[]args){
        Persona persona1=new Persona("Omar",22);
        Persona persona2=new Persona("Luca",12);
        Persona persona3=new Persona("Anna",18);
        System.out.println(persona1.getName()+" maggiorenne: "+persona1.isMaggiorenne());
        persona1.stampa();
        System.out.println("....................");
        System.out.println(persona2.getName()+" maggiorenne: "+persona2.isMaggiorenne());
        persona2.stampa();
        System.out.println("....................");
        System.out.println(persona3.getName()+" maggiorenne: "+persona3.isMaggiorenne());
        persona3.stampa();
        System.out.println("....................");
    }
}
