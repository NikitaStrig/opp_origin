package transport;

import java.io.IOException;

public class TransportTypeException extends Exception {
    public TransportTypeException() {
    }

    public TransportTypeException(String message) {
        super(message);
    }
}
