package pl.javastart.task.exceptions;

public class TooHighTemperatureException extends RuntimeException {
    public TooHighTemperatureException(String message) {
        super(message);
    }
}
