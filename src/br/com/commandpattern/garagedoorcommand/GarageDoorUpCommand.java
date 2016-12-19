package br.com.commandpattern.garagedoorcommand;

import br.com.commandpattern.domain.GarageDoor;
import br.com.commandpattern.util.Command;

public class GarageDoorUpCommand implements Command {

	private final GarageDoor garageDoor;

	public GarageDoorUpCommand(final GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		System.out.print(garageDoor.on());
	}

	@Override
	public void undo() {
		garageDoor.off();
	}

}
