package br.com.commandpattern.garagedoorcommand;

import br.com.commandpattern.domain.GarageDoor;
import br.com.commandpattern.util.Command;

public class GarageDoorDownCommand implements Command {

	private final GarageDoor garageDoor;
	
	public GarageDoorDownCommand(final GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		System.out.print(garageDoor.off());
	}

	@Override
	public void undo() {
		garageDoor.on();
	}

}
