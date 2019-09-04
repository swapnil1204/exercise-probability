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
}
