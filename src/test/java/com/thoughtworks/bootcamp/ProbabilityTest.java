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
    void givenEqualProbabilityOfTwoEvents_WhenEqual_ThenItShouldReturnTrue(){
        Probability probabilityOfAnEventWithVAlueAsTwoPointFive = new Probability(0.5f);;
        assertTrue(probabilityOfAnEventWithVAlueAsTwoPointFive.equals(probabilityOfAnEventWithVAlueAsTwoPointFive));
    }
    @Test
    void givenUnEqualProbabilityOfTwoEvents_WhenEqual_ThenItShouldReturnFalse(){
        assertFalse(certainEvent.equals(impossibleEvent));
    }
    @Test
    void givenProbabilityHeadWhenCoinToss_WhenCheckNoOccurence_ThenItShouldReturnPointFive(){
        Probability probabilityOfAnEventWithVAlueAsTwoPointFive = new Probability(0.5f);;
        assertEquals(0.5f, probabilityOfAnEventWithVAlueAsTwoPointFive.checkOccurence());
    }
    @Test
    void givenProbabilityOfHeadWhenCoinTossIsPointSeven_WhenCheckNoOccurence_ThenItShouldReturnPointFive(){
        Probability probabilityOfEventHeadWhenCoinToss= new Probability(0.7f);
        assertEquals(0.3f,probabilityOfEventHeadWhenCoinToss.checkOccurence());
    }
    @Test
    void givenZeroProbabilityOfHeadWhenCoinTossAndOddNumberWhenDiceThrown_WhenEventsTogether_ThenItShouldReturnExpectedResult(){
        assertEquals(0.0f, impossibleEvent.eventsTogether(impossibleEvent));
    }
    @Test
    void givenOneProbabilityOfHeadWhenCoinTossAndOddNumberWhenDiceThrown_WhenEventsTogether_ThenItShouldReturnExpectedResult(){
        assertEquals(1.0f, certainEvent.eventsTogether(certainEvent));
    }
    @Test
    void givenProbabilityOfHeadWhenCoinTossAndOddNumberWhenDiceThrown_WhenEventsTogether_ThenItShouldReturnExpectedResult(){
        Probability probabilityOfAnEventWithTwoPointFive = new Probability(2.5f);
        assertEquals(6.25f, probabilityOfAnEventWithTwoPointFive.eventsTogether(probabilityOfAnEventWithTwoPointFive));
    }
    
}

