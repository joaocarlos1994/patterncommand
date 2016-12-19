package br.com.commandpattern.lightcommand;

import br.com.commandpattern.domain.Light;
import br.com.commandpattern.util.Command;

public class LightOffCommand implements Command {
	
	private final Light light;

	public LightOffCommand(final Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println(light.off());
	}

	@Override
	public void undo() {
		System.out.println(light.on());
	}

}
