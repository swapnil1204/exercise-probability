package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbabilityTest {
    private static Probability probabilityOfHeadWhenCoinToss;
    private static Probability probabilityOfEvenNumberWhenDiceThrown;
    private static Probability probabilityOfEventHeadWhenCoinToss ;
    private static Probability probabilityOfEventOneWhenDiceThrown;
    private static Probability probabilityOfEventHeadWhenCoinToss1;
    private static Probability probability;
    private static Probability anotherProbabilityOfEvent;
    private static Probability probabilityOfAnEvntWIthOne;
    private static Probability probabilityOfAnEventWithTwoPointFive;


    @BeforeAll
    static void setup(){
        probabilityOfHeadWhenCoinToss = new Probability(0.5f);
        probabilityOfEvenNumberWhenDiceThrown = new Probability(0.5f);
        probabilityOfEventHeadWhenCoinToss = new Probability(0.5f);
        probabilityOfEventOneWhenDiceThrown = new Probability(0.4f);
        probabilityOfEventHeadWhenCoinToss1 = new Probability(0.7f);
        probabilityOfEventHeadWhenCoinToss = new Probability(0.5f);
        probability = new Probability(0.0f);
        anotherProbabilityOfEvent = new Probability(0.0f);
        probabilityOfAnEvntWIthOne = new Probability(1.0f);
        probabilityOfAnEventWithTwoPointFive = new Probability(2.5f);
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
    @Test
    void givenZeroProbabilityOfHeadWhenCoinTossAndOddNumberWhenDiceThrown_WhenEventsTogether_ThenItShouldReturnExpectedResult(){
        assertEquals(0.0f, probability.eventsTogether(anotherProbabilityOfEvent));
    }
    @Test
    void givenOneProbabilityOfHeadWhenCoinTossAndOddNumberWhenDiceThrown_WhenEventsTogether_ThenItShouldReturnExpectedResult(){
        assertEquals(1.0f, probabilityOfAnEvntWIthOne.eventsTogether(probabilityOfAnEvntWIthOne));
    }
    @Test
    void givenProbabilityOfHeadWhenCoinTossAndOddNumberWhenDiceThrown_WhenEventsTogether_ThenItShouldReturnExpectedResult(){
        assertEquals(6.25f, probabilityOfAnEventWithTwoPointFive.eventsTogether(probabilityOfAnEventWithTwoPointFive1));
    }
    
}

