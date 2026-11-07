package com.example.grade_calculator;
import org.junit.jupiter.api.Test;

import com.example1.GradeCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorTest {

    GradeCalculator gc = new GradeCalculator();

    @Test
    public void testGradeA() {
        assertEquals("A", gc.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", gc.calculateGrade(85));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", gc.calculateGrade(50));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", gc.calculateGrade(30));
    }

    @Test
    public void testBoundary90() {
        assertEquals("A", gc.calculateGrade(90));
    }

    @Test
    public void testBoundary80() {
        assertEquals("B", gc.calculateGrade(80));
    }

    @Test
    public void testBoundary40() {
        assertEquals("C", gc.calculateGrade(40));
    }

    @Test
    public void testInvalidMarks() {
        assertEquals("Invalid Marks", gc.calculateGrade(110));
    }

    @Test
    public void testZero() {
        assertEquals("F", gc.calculateGrade(0));
    }
}



