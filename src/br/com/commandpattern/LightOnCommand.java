package br.com.commandpattern;

public class LightOnCommand implements Command {

	private final Light light;
	
	public LightOnCommand(final Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println(light.on());
	}

}
