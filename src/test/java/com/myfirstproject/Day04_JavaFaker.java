package com.myfirstproject;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day04_JavaFaker {
    @Test
    public void test1() {
        Faker faker = new Faker();
        String fName = faker.name().firstName();
        System.out.println(fName);

        String lName = faker.name().lastName();
        System.out.println(lName);
        String fullName = faker.name().fullName();
        System.out.println(fullName);
        String username = faker.name().username();
        System.out.println(username);
        String title = faker.name().title();
        System.out.println(title);
        String city = faker.address().city();
        System.out.println(city);
        String state = faker.address().state();
        System.out.println(state);
        String phoneNumber = faker.phoneNumber().cellPhone();
        System.out.println(phoneNumber);
        String email = faker.internet().emailAddress();
        System.out.println(email);
        String randomZipCode = faker.number().digits(5);
        System.out.println(randomZipCode);
        String fakeEmail = faker.name().firstName() + faker.number().digits(3)+faker.internet().emailAddress();
        System.out.println(fakeEmail);
    }
}
