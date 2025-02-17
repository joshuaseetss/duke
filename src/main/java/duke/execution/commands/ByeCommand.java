package duke.execution.commands;

import duke.exception.DukeException;
import duke.execution.Storage;
import duke.execution.TaskList;
import duke.execution.UI;

/**
 * Represents the characteristics of a Bye Command object.
 */
public class ByeCommand extends Command {

    /**
     * Constructs a ByeCommand.
     *
     * @param bye string value would not matter for this case since we are only interested in the keyword bye.
     */
    public ByeCommand(String bye) {

        super(bye);

    }

    /**
     * Executes a bye command.
     *
     * @param taskList current tasklist.
     * @param ui to set a response from duke.
     * @param storage to store any changes in the storage.
     * @throws DukeException thrown if there are any errors.
     */
    @Override
    public void execute(TaskList taskList, UI ui, Storage storage) throws DukeException {

        super.execute(taskList, ui, storage);
        checkValidity();

        ui.exit();

    }
}
