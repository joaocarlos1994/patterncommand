package br.com.commandpattern;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		final Light light = new Light();
		final LightOnCommand lightOnCommand = new LightOnCommand(light);
		final SimpleRemoteControl remoteControl = new SimpleRemoteControl(lightOnCommand);
		remoteControl.buttonWasPressed();

	}

}
