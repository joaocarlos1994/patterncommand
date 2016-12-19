package br.com.commandpattern.celingfancommand;

import br.com.commandpattern.domain.CeilingFan;
import br.com.commandpattern.util.Command;

public class CelingFanOnCommand implements Command {
	
	private final CeilingFan ceilingFan;

	public CelingFanOnCommand(final CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.on();
	}

	@Override
	public void undo() {
		ceilingFan.off();
	}

}
