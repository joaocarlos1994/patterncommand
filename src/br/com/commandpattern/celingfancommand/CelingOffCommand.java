package br.com.commandpattern.celingfancommand;

import br.com.commandpattern.domain.CeilingFan;
import br.com.commandpattern.util.Command;

public class CelingOffCommand implements Command {
	
	private final CeilingFan ceilingFan;

	public CelingOffCommand(final CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		ceilingFan.off();
	}

	@Override
	public void undo() {
		ceilingFan.on();
	}

}
