package com.github.sovaalexandr.convert_string_to_camel_case;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertStringToCamelCaseTest
{

    private final ConvertStringToCamelCase target = new ConvertStringToCamelCase();

    @Test
    void testSomeUnderscoreLowerStart() {
        assertEquals("theStealthWarrior", target.toCamelCase("the_Stealth_Warrior"));
    }
    @Test
    void testSomeDashLowerStart() {
        assertEquals("theStealthWarrior", target.toCamelCase("the-Stealth-Warrior"));
    }
}