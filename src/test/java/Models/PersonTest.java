package Models;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void verifyReturnedFirstNameIsCorrect() {
        Person person = new Person(
                "Jennifer",
                "Hammer",
                "Lopez",
                'F',
                2);

        assertEquals("Jennifer", person.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void verifyReturnedFirstNameIsCorrectAfterItHasBeenChanged() {
        String firstName = "Aubrey";

        Person person = new Person(
                "Jennifer",
                "Hammer",
                "Lopez",
                'F',
                2);

        person.setFirstName(firstName);

        assertEquals(firstName, person.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void verifyReturnedMiddleNameIsCorrect() {
        Person person = new Person(
                "Jennifer",
                "Hammer",
                "Lopez",
                'F',
                2);

        assertEquals("Hammer", person.getMiddleName());
    }

    @org.junit.jupiter.api.Test
    void verifyReturnedMiddleNameIsCorrectAfterItHasBeenChanged() {
        String middleName = "Aubrey";

        Person person = new Person(
                "Jennifer",
                "Hammer",
                "Lopez",
                'F',
                2);

        person.setMiddleName(middleName);

        assertEquals(middleName, person.getMiddleName());
    }

    @org.junit.jupiter.api.Test
    void verifyReturnedLastNameIsCorrect() {
        Person person = new Person(
                "Jennifer",
                "Hammer",
                "Lopez",
                'F',
                2);

        assertEquals("Lopez", person.getLastName());
    }

    @org.junit.jupiter.api.Test
    void verifyReturnedLastNameIsCorrectAfterItHasBeenChanged() {
        String lastName = "Aubrey";

        Person person = new Person(
                "Jennifer",
                "Hammer",
                "Lopez",
                'F',
                2);

        person.setLastName(lastName);

        assertEquals(lastName, person.getLastName());
    }

    @org.junit.jupiter.api.Test
    void verifyReturnedGenderIsCorrect() {
        Person person = new Person(
                "Jennifer",
                "Hammer",
                "Lopez",
                'F',
                2);

        assertEquals('F', person.getGender());
    }

    @org.junit.jupiter.api.Test
    void verifyReturnedGenderIsCorrectAfterItHasBeenChanged() {
        char gender = 'M';

        Person person = new Person(
                "Jennifer",
                "Hammer",
                "Lopez",
                'F',
                2);

        person.setGender(gender);

        assertEquals(gender, person.getGender());
    }

    @org.junit.jupiter.api.Test
    void verifyReturnedAgeIsCorrect() {
        Person person = new Person(
                "Jennifer",
                "Hammer",
                "Lopez",
                'F',
                2);

        assertEquals(2, person.getAge());
    }

    @org.junit.jupiter.api.Test
    void verifyReturnedAgeIsCorrectAfterItHasBeenChanged() {
        int age = 15;

        Person person = new Person(
                "Jennifer",
                "Hammer",
                "Lopez",
                'F',
                2);

        person.setAge(age);

        assertEquals(age, person.getAge());
    }
}