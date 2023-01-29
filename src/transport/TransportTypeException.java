package transport;

import java.io.IOException;

public class TransportTypeException extends RuntimeException {
    public TransportTypeException() {
    }

    public TransportTypeException(String message) {
        super(message);
    }
}
