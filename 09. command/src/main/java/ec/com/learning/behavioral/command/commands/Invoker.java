package ec.com.learning.behavioral.command.commands;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class Invoker {

    private List<IOperation> operations = new ArrayList<>();

    public void receiveOperations(IOperation operation) {
        this.operations.add(operation);
    }

    public void executeOperations() {
        this.operations.forEach(x -> x.execute());
        this.operations.clear();
    }
}
