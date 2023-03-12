package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(5, 5);
        int resultSubtract = calculator.subtract(10, 5);

        if (resultAdd == 10) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Add error!");
        }

        if (resultSubtract == 5) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Subtract error!");
        }

    }
}

