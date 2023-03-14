package com.example.answer.builder;

public class BuilderUsage {

    public static void main(String[] args)
    {
        Person person = Person.builder()
                .firstName("Bill")
                .lastName("Klinton")
                .middleName("-")
                .country("USA")
                .address("1600 Pennsylvania Avenue NW, Washington, DC 20500")
                .phone("546-656-7887")
                .age(58)
                .gender("male")
                .build();

        System.out.println(person.toString());
    }
}
