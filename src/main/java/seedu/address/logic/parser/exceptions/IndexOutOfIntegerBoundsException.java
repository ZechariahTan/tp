package seedu.address.logic.parser.exceptions;

import seedu.address.commons.exceptions.IllegalValueException;

/**
 * Represents an Index out of integer bounds error encountered by a parser.
 */
public class IndexOutOfIntegerBoundsException extends IllegalValueException {

    public IndexOutOfIntegerBoundsException(String message) {
        super(message);
    }

    public IndexOutOfIntegerBoundsException(String message, Throwable cause) {
        super(message, cause);
    }
}
