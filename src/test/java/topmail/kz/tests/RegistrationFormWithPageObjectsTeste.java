package topmail.kz.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import topmail.kz.pages.RegistrationFormPage;


public class RegistrationFormWithPageObjectsTeste extends TestData{

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        //test for main page;
        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(secondName)
                .setEmail(email)
                .setGender(Gender)
                .setPhoneNumber(mPhone)
                .setBirthDate(dayOfBirth, monthOfBirth, yearOfBirth)
                .setSubject(perSubject1)
                .setSubject(perSubject2)
                .setHobbies(hobby1, hobby2)
                .loadPicture(path)
                .setCurrAddress(currAddress)
                .setState(state)
                .setCity(city)
                .clickSubmitButton();

        //test for modal page;
        registrationFormPage.checkResultTableVisible()
                .checkResult("Student Name", firstName + " " + secondName)
                .checkResult("Student Email", email)
                .checkResult("Gender", "Male")
                .checkResult("Mobile", mPhone)
                .checkResult("Date of Birth", dayOfBirth + " " + monthOfBirth + "," + yearOfBirth)
                .checkResult("Subjects", perSubject1 + "," + " "+ perSubject2)
                .checkResult("Hobbies", hobby1)
                .checkResult("Hobbies", hobby2)
                .checkResult("Picture", path)
                .checkResult("Address", currAddress)
                .checkResult("State and City", state)
                .checkResult("State and City", city);
    }

}
