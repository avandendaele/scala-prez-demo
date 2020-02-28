package com.github.avandendaele.scalaprez.act.first;

public class Person {

    private final String name;
    private final String firstName;

    public Person(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }
}
