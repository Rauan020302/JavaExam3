package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Person> list = new LinkedList<>();
        Person person1 = new Person("Ivanov", "Ivan", "Ivanovi4");
        Person person3 = new Person("Sergeev", "Sergey", "Sergeevi4");


        list.add(person1);
        System.out.println(person1.addPerson(list,person3));


    }


}
