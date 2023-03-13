package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


@DisplayName("TDD: ShapeCollector Test Suite")
class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests. \n");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter + "\n");
    }

    @Nested
    @DisplayName("Tests for adding figures")
    class TestAddFigure {
        @Test
        void testAddCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle One", 5.0);

            //When
            shapeCollector.addFigure(shape);

            //Then
            assertEquals(1, shapeCollector.getShapeQuantity());
        }

        @Test
        void testAddSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square("Square One", 5.0);

            //When
            shapeCollector.addFigure(shape);

            //Then
            assertEquals(1, shapeCollector.getShapeQuantity());
        }

        @Test
        void testAddTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle("Triangle One", 5.0, 5.0);

            //When
            shapeCollector.addFigure(shape);

            //Then
            assertEquals(1, shapeCollector.getShapeQuantity());
        }
    }

    @Nested
    @DisplayName("Tests for removing figures")
    class TestRemoveFigure {
        @Test
        void testRemoveCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle One", 5.0);
            shapeCollector.addFigure(shape);

            //When
            shapeCollector.removeFigure(shape);

            //Then
            assertEquals(0, shapeCollector.getShapeQuantity());
        }

        @Test
        void testRemoveSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square("Square One", 5.0);
            shapeCollector.addFigure(shape);

            //When
            shapeCollector.removeFigure(shape);

            //Then
            assertEquals(0, shapeCollector.getShapeQuantity());
        }

        @Test
        void testRemoveTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle("Triangle One", 5.0, 5.0);
            shapeCollector.addFigure(shape);

            //When
            shapeCollector.removeFigure(shape);

            //Then
            assertEquals(0, shapeCollector.getShapeQuantity());
        }
    }

    @Nested
    @DisplayName("Tests for getting figures")
    class TestGetFigure {
        @Test
        void testGetCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle One", 5.0);
            shapeCollector.addFigure(shape);

            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            assertEquals(shape, retrievedShape);
        }

        @Test
        void testGetSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square("Square One", 5.0);
            shapeCollector.addFigure(shape);

            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            assertEquals(shape, retrievedShape);
        }

        @Test
        void testGetTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle("Triangle One", 5.0, 5.0);
            shapeCollector.addFigure(shape);

            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            assertEquals(shape, retrievedShape);
        }
    }

    @Nested
    @DisplayName("Tests for showing figures")
    class TestShowFigures {
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle One", 5.0);
            shapeCollector.addFigure(shape);

            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.showFigures();

            //Then
            assertEquals(shape, retrievedShape);
        }
    }
}
