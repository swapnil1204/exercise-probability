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

    public Probability not() {
        return new Probability(1.0f - probabilityOfEvent);
    }

    public Probability with(Object obj) {
        Probability object = (Probability) obj;
        return new Probability(probabilityOfEvent * object.probabilityOfEvent);
    }

    public Probability eighter(Probability event) {
        return new Probability(probabilityOfEvent).not().with(new Probability(event.probabilityOfEvent).not()).not();
    }

}
