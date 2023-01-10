package be.bowling;

public class Frame {

    private int pins = 0;
    private int nbRolls = 0;
    private static final int MAX_PINS_PER_FRAME = 10;

    public Frame(int pins) {
        assertValidPins(pins);
        this.pins = pins;
        nbRolls = 1;
    }

    public void add(int newPins) {
        assertValidPins(newPins);
        pins += newPins;
        nbRolls++;
    }

    private void assertValidPins(int newPins){
        if(this.pins + newPins > MAX_PINS_PER_FRAME)
            throw new IllegalPinException("Cannot throw more than 10 pins");
    }

    public int score() {
        return pins;
    }

    public boolean isComplete() {
        return nbRolls == 2;
    }
}
