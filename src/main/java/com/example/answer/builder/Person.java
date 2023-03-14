package com.example.answer.builder;

import lombok.*;

@Data
@AllArgsConstructor()
@Builder
public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String country;
    private final String address;
    private final String phone;
    private final int age;
    private final String gender;
}
