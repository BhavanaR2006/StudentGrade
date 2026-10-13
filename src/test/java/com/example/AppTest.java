package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

@Test
public void testGradeA() {
    App obj = new App();
    assertEquals("A", obj.calculateGrade(95));
}

@Test
public void testGradeB() {
    App obj = new App();
    assertEquals("B", obj.calculateGrade(85));
}

@Test
public void testGradeF() {
    App obj = new App();
    assertEquals("F", obj.calculateGrade(45));
}

}