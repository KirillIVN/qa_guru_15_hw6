package topmail.kz.tests;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String secondName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String Gender = faker.demographic().sex();
    String mPhone = faker.phoneNumber().subscriberNumber(10);
    String currAddress = faker.address().streetAddress();
    static String dayOfBirth = "04";
    static String monthOfBirth = "July";
    static String yearOfBirth = "1975";
    static String perSubject1 = "Accounting";
    static String perSubject2 = "English";
    static String hobby1 = "Sports";
    static String hobby2 = "Music";
    static String path = "cat1.jpg";
    static String state = "Haryana";
    static String city = "Panipat";
}
