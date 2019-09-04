package com.thoughtworks.bootcamp;

public class Probability {
    private final float probabilityOfEvent;

    public Probability(float probabilityOfEvent) {
        this.probabilityOfEvent = probabilityOfEvent;
    }

    @Override
    public boolean equals(Object obj){
        return this.probabilityOfEvent == ((Probability) obj).probabilityOfEvent;
    }
}
