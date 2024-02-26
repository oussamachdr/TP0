package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p = new Person("choudar","oussama",22);
    @Test
    void getFullNameThatShouldBeCorrect() {
        String result = "choudar oussama";
        Assertions.assertEquals(result,p.getFullName());
    }
    @Test
    void getFullNameThatShouldBeFalse() {
        String result = "Choudar oussama";
        Assertions.assertNotEquals(result,p.getFullName());
    }

    @Test
    void isAdultShouldReturnTrueIfAgeIsGreaterThanOrEqualTo18() {
        p.setAge(18);
        assertTrue(p.isAdult());
    }
    @Test
    void isAdultShouldReturnFalseIfAgeIsLessThan18() {
        p.setAge(17);
        assertFalse(p.isAdult());
    }
}