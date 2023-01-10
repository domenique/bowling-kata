package be.bowling;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Frame> frames = new ArrayList<>();

    public int score() {
        return frames.stream().map(Frame::score).reduce(0, Integer::sum);
    }

    public void roll(int pins) {
        if(isNewFrame()){
            frames.add(new Frame(pins));
        } else {
            frames.get(frames.size() - 1).add(pins);
        }
    }

    private boolean isNewFrame() {
        return frames.size() == 0 || frames.get(frames.size() -1).isComplete();
    }
}
