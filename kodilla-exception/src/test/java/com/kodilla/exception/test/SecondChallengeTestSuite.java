package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTestSuite {

    @Test
    public void testProbablyIWillThrowException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertAll(
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.0)),
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1.0)),
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 1.0))
        );
    }
}