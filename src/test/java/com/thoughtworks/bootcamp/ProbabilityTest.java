package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProbabilityTest {
    private static Probability probabilityOfHeadWhenCoinToss;
    private static Probability probabilityOfEvenNumberWhenDiceThrown;
    private static Probability probabilityOfEventHeadWhenCoinToss = new Probability(0.5f);
    private static Probability probabilityOfEventOneWhenDiceThrown;

    @BeforeAll
    static void setup(){
        probabilityOfHeadWhenCoinToss = new Probability(0.5f);
        probabilityOfEvenNumberWhenDiceThrown = new Probability(0.5f);
        probabilityOfEventHeadWhenCoinToss = new Probability(0.5f);
        probabilityOfEventOneWhenDiceThrown = new Probability(0.4f);
        Probability probabilityOfEventHeadWhenCoinToss1 = new Probability(0.7f);
    }
    @Test
    void givenEqualProbabilityOfTwoEvents_WhenEqual_ThenItShouldReturnTrue(){
        assertTrue(probabilityOfHeadWhenCoinToss.equals(probabilityOfEvenNumberWhenDiceThrown));
    }
    @Test
    void givenUnEqualProbabilityOfTwoEvents_WhenEqual_ThenItShouldReturnFalse(){
        assertFalse(probabilityOfEventHeadWhenCoinToss.equals(probabilityOfEventOneWhenDiceThrown));
    }
    @Test
    void givenProbabilityHeadWhenCoinToss_WhenCheckNoOccurence_ThenItShouldReturnPointFive(){
        assertEquals(0.5f,probabilityOfEventHeadWhenCoinToss.checkOccurence());
    }
    @Test
    void givenProbabilityOfHeadWhenCoinTossIsPointSeven_WhenCheckNoOccurence_ThenItShouldReturnPointFive(){
        assertEquals(0.3f,probabilityOfEventHeadWhenCoinToss1.checkOccurence());
    }
//    @Test
//    void givenProbabilityOfHeadWhenCoinTossAndOddNumberWhenDiceThrown_WhenEventsTogether_ThenItShouldReturnExpectedResult(){
//        float ProbabilityOfHeadWhenCoinToss = 2.5f;
//        float ProbabilityOfEvenNumberWhenDiceThrown = 2.5f;
//        Probability probability = new Probability(ProbabilityOfHeadWhenCoinToss);
//        Probability anotherProbabilityOfEvent = new Probability(ProbabilityOfEvenNumberWhenDiceThrown);
//        assertEquals(6.25f, probability.eventsTogether(anotherProbabilityOfEvent));
//    }
}

