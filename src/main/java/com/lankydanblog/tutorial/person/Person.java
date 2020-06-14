package com.lankydanblog.tutorial.person;

import lombok.Data;

import java.util.UUID;

@Data
public class Person {

  private UUID id;
  private String firstName;
  private String lastName;
  private String country;
  private int age;

  public Person() {}

  public Person(UUID id, String firstName, String lastName, String country, int age) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.country = country;
    this.age = age;
  }

  public Person(Person person, UUID id) {
    this.id = id;
    this.firstName = person.firstName;
    this.lastName = person.lastName;
    this.country = person.country;
    this.age = person.age;
  }
}
