package com.hillel;

public class PersonTest {

    public static void main(String[] args){

        Person person1 = new Person();

        person1.setName("Oleg");
        person1.setAge(19);

        System.out.println("Name: " + person1.getName() + " Age: " + person1.getAge());

        System.out.println("Before change");
        Person person2 = person1;
        System.out.println("Person1: ");
        printPerson(person1);
        System.out.println("Person2: ");
        printPerson(person2);
        changePerson(person2);

        System.out.println("After change");
        System.out.println("Person1: ");
        printPerson(person1);
        System.out.println("Person2: ");
        printPerson(person2);

    }

    public static void changePerson(Person person){
            person.setName(person.getName() + " Changed");
            person.setAge(person.getAge() + 100);


    }
    public static void printPerson(Person person){
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }

}
