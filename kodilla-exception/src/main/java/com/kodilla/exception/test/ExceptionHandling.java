package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public void handleException(double a, double b) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(a, b);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("End of program.");
        }
    }
}
