package br.com.commandpattern;

public class SimpleRemoteControl {
	
	private final Command slot;

	public SimpleRemoteControl(final Command slot) {
		super();
		this.slot = slot;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
	
}
