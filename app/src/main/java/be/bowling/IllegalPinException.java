package be.bowling;

public class IllegalPinException extends RuntimeException {
    public IllegalPinException(String message) {
        super(message);
    }
}
