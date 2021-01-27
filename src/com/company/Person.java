package com.company;

import java.util.LinkedList;

public class Person {
    private String surname;
    private String name;
    private String fullName;

    public Person(String surname, String name, String fullName) {
        this.surname = surname;
        this.name = name;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + fullName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Person){
            return (((Person) obj).surname.equals(this.surname) &&
                    ((Person) obj).name.equals(this.name) &&
                    ((Person) obj).fullName.equals(this.fullName));
        }
        return false;
    }
    public  LinkedList<Person> addPerson(LinkedList<Person> linkedList,Person person) throws IllegalArgumentException {
        for (int i = 0; i < linkedList.size(); i++){
            for (int j = i+1; j < linkedList.size();j++){
                if (linkedList.get(i).equals(linkedList.get(j))){
                    throw new IllegalArgumentException();
                }else{
                    linkedList.add(person);
                }
            }
        }
        return linkedList;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
