package com.thoughtworks.bootcamp;

public class Probability {
    private final float probabilityOfEvent;

    public Probability(float probabilityOfEvent) {
        this.probabilityOfEvent = probabilityOfEvent;
    }

    @Override
    public boolean equals(Object obj) {
        return this.probabilityOfEvent == ((Probability) obj).probabilityOfEvent;
    }

    public float not() {
        return 1.0f - probabilityOfEvent;
    }

    public float with(Object obj) {
        return this.probabilityOfEvent * ((Probability) obj).probabilityOfEvent;
    }

    public Probability eighter(Probability event) {
        //error : cannot resolve with float if return type of float is with
        return new Probability(probabilityOfEvent).not().with(new Probability(event.probabilityOfEvent).not()).not();
    }

}
