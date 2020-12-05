package com.hillel;

public class ClassTest {

        public static void main(String[] args){

            Dog dog = new Dog();
            Dog anotherDog = dog;
            Dog dog3 = new Dog();
            Dog dog4 = anotherDog;
            System.out.println(dog);
            System.out.println("Another dog: " + anotherDog);
            System.out.println("Another dog: " + dog3);
            System.out.println("Another dog: " + dog4);


            dog = null;
            System.out.println(dog);
        }


}
