package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.commons.core.Messages.MESSAGE_INVALID_PASSENGER_DISPLAYED_INDEX;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.EditCommand;
import seedu.address.logic.commands.UnpoolCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new UnpoolCommand object
 */
public class UnpoolCommandParser implements Parser<UnpoolCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the UnpoolCommand
     * and returns a UnpoolCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public UnpoolCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            if (!args.trim().chars().allMatch(Character::isDigit)) {
                throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, UnpoolCommand.MESSAGE_USAGE));
            }
            return new UnpoolCommand(index);
        } catch (ParseException pe) {
            throw new ParseException(MESSAGE_INVALID_PASSENGER_DISPLAYED_INDEX);
        }
    }

}
