package br.com.commandpattern.util;

import br.com.commandpattern.domain.NoCommand;

/**
 * A <code>RemoteControl</code> gerencia um 
 * conjunto de objetos de Comando, um por botao.
 * Quando um botao e pressionado, o metodo
 * buttonWasPress() correspondente e chamado e,
 * por sua vez, invoca o metodo execute no comando.
 * Isto e tudo que o controle remoto sabe sobre as
 * classes que esta invocando, pois o Objeto de 
 * Comando desconecta o controle remoto das classes
 * que executam o trabalho real de automacao.
 * */
public class RemoteControl {

	private final Command[] onCommands;
	private final Command[] offCommands;
	private final NoCommand noCommand = new NoCommand();
	private Command undoCommand;

	public RemoteControl() {
		super();
		this.onCommands = new Command[7];
		this.offCommands = new Command[7];

		for (int i = 0; i < 7; i++) {
			this.onCommands[i] = noCommand;
			this.offCommands[i] = noCommand;
		}
		this.undoCommand = noCommand;
	}
	
	public void setCommand(final int slot, final Command onCommand, final Command offCommand) {
		offCommands[slot] = offCommand;
		onCommands[slot] = onCommand;
	}
	
	public void onButtonWasPushed(final int slot) {
		onCommands[slot].execute();
		setUndoCommand(onCommands[slot]);
	}
	
	public void offButtonWasPushed(final int slot) {
		offCommands[slot].execute();
		setUndoCommand(offCommands[slot]);
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
	public void setUndoCommand(final Command undoCommand) {
		if (undoCommand != null) {
			this.undoCommand = undoCommand;
		} else {
			throw new NullPointerException();
		}
	}

	@Override
	public String toString() {
		final StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n----- Remote Control -----\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuffer.append("[slot " + i + "]" + onCommands[i].getClass().getName()
					+ "		" + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuffer.toString();
	}
}
