package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create OddNumbersExterminator with empty list, " +
            "then exterminate should return empty list"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("when create OddNumbersExterminator with list, " +
            "then exterminate should return list without odd numbers"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> normalList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expectedList = Arrays.asList(2, 4, 6, 8, 10);
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals(expectedList, result);
    }
}