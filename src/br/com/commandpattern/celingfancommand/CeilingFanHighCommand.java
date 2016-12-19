package br.com.commandpattern.celingfancommand;

import br.com.commandpattern.domain.CeilingFan;
import br.com.commandpattern.util.Command;

public class CeilingFanHighCommand implements Command {

	private final CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.on();
		this.prevSpeed = ceilingFan.getSpeed();
		ceilingFan.hight();
	}

	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.hight();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}

}
