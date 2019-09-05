package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbabilityTest {
    private static Probability impossibleEvent;
    private static Probability certainEvent;

    @BeforeAll
    static void setup() {
        impossibleEvent = new Probability(0.0f);
        certainEvent = new Probability(1.0f);
    }

    @Test
    void givenEqualProbabilityOfTwoEvents_WhenEqual_ThenItShouldReturnTrue() {
        Probability probabilityOfAnEventWithVAlueAsTwoPointFive = new Probability(0.5f);
        ;
        assertTrue(probabilityOfAnEventWithVAlueAsTwoPointFive.equals(probabilityOfAnEventWithVAlueAsTwoPointFive));
    }

    @Test
    void givenUnEqualProbabilityOfTwoEvents_WhenEqual_ThenItShouldReturnFalse() {
        assertFalse(certainEvent.equals(impossibleEvent));
    }

    @Test
    void givenZeroOccurrenceProbability_WhenUnOccurredProbability_ThenItShouldReturnOne() {
        assertEquals(1.0f, impossibleEvent.not());
    }

    @Test
    void givenOccurrenceProbabilityValueAsPointSeven_WhenUnOccurredProbability_ThenItShouldReturnPointThree() {
        Probability probabilityOfEventHeadWhenCoinToss = new Probability(0.7f);
        assertEquals(0.3f, probabilityOfEventHeadWhenCoinToss.not());
    }

    @Test
    void givenZeroProbabilityOfTwoEvent_WhenEventsTogether_ThenItShouldReturnZero() {
        assertEquals(0.0f, impossibleEvent.with(impossibleEvent));
    }

    @Test
    void givenOneProbabilityOfTwoEvent_WhenEventsTogether_ThenItShouldReturnExpectedResult() {
        assertEquals(1.0f, certainEvent.with(certainEvent));
    }

    @Test
    void givenProbabilityOfTwoEventAsTwoPointFive_WhenEventsTogether_ThenItShouldReturnSixPointFive() {
        Probability probabilityOfAnEventWithTwoPointFive = new Probability(2.5f);
        assertEquals(6.25f, probabilityOfAnEventWithTwoPointFive.with(probabilityOfAnEventWithTwoPointFive));
    }

    @Test
    void whenTwoImpossibleEvents_WhenEighterEventsOccurred_ThenItShouldReturnZero() {
        assertEquals(impossibleEvent, impossibleEvent.eighter(impossibleEvent));
    }

    @Test
    void whenOneCertainEventsAndOneImpossibleEvents_WhenEighterEventsOccurred_ThenItShouldReturnOne() {
        assertEquals(certainEvent, certainEvent.eighter(impossibleEvent));
    }
}



