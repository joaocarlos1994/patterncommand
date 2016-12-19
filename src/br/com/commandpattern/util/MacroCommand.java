package br.com.commandpattern.util;

public class MacroCommand implements Command {
	
	private final Command[] commands;

	public MacroCommand(final Command[] commands) {
		super();
		this.commands = commands;
	}

	@Override
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].undo();
		}
	}

}
