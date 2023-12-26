package com.example.task3;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

enum Sex{
    MALE, FEMALE
}

@Getter @AllArgsConstructor
public class Client {
    private int id;
    private String name;
    private int age;
    private Sex sex;
}
