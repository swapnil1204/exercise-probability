package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProbabilityTest {
    @Test
    void givenEqualProbabilityOfTwoEvents_WhenEqual_ThenItShouldReturnTrue(){
        Probability probabilityOfEventHeadWhenCoinToss = new Probability(0.5f);
        Probability probabilityOfEventOneWhenDiceThrown = new Probability(0.5f);
        Assertions.assertTrue(probabilityOfEventHeadWhenCoinToss.equals(probabilityOfEventOneWhenDiceThrown));
    }
}
