package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbabilityTest {
    @Test
    void givenEqualProbabilityOfTwoEvents_WhenEqual_ThenItShouldReturnTrue(){
        Probability probabilityOfEventHeadWhenCoinToss = new Probability(0.5f);
        Probability probabilityOfEventOneWhenDiceThrown = new Probability(0.5f);
        assertTrue(probabilityOfEventHeadWhenCoinToss.equals(probabilityOfEventOneWhenDiceThrown));
    }
    @Test
    void givenUnEqualProbabilityOfTwoEvents_WhenEqual_ThenItShouldReturnFalse(){
        Probability probabilityOfEventHeadWhenCoinToss = new Probability(0.5f);
        Probability probabilityOfEventOneWhenDiceThrown = new Probability(0.4f);
        assertFalse(probabilityOfEventHeadWhenCoinToss.equals(probabilityOfEventOneWhenDiceThrown));
    }
    @Test
    void givenProbabilityHeadWhenCoinToss_WhenCheckNoOccurence_ThenItShouldReturnPointFive(){
        Probability probabilityOfEventHeadWhenCoinToss = new Probability(0.5f);
        assertEquals(0.5f,probabilityOfEventHeadWhenCoinToss.checkOccurence());
    }
    @Test
    void givenProbabilityOfHeadWhenCoinTossIsPointSeven_WhenCheckNoOccurence_ThenItShouldReturnPointFive(){
        Probability probabilityOfEventHeadWhenCoinToss = new Probability(0.7f);
        assertEquals(0.3f,probabilityOfEventHeadWhenCoinToss.checkOccurence());
    }
    @Test
    void givenProbabilityOfHeadWhenCoinTossAndOddNumberWhenDiceThrown_WhenEventsTogether_ThenItShouldReturnExpectedResult(){
        float ProbabilityOfHeadWhenCoinToss = 2.5f;
        float ProbabilityOfEvenNumberWhenDiceThrown = 2.5f;
        Probability probability = new Probability(ProbabilityOfHeadWhenCoinToss);
        Probability anotherProbabilityOfEvent = new Probability(ProbabilityOfEvenNumberWhenDiceThrown);
        assertEquals(6.25f, probability.eventsTogether(anotherProbabilityOfEvent));
    }
}
