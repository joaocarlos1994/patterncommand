package br.com.commandpattern;

import br.com.commandpattern.domain.Light;
import br.com.commandpattern.domain.Stereo;
import br.com.commandpattern.lightcommand.LightOffCommand;
import br.com.commandpattern.lightcommand.LightOnCommand;
import br.com.commandpattern.stereocommand.StereoOffCommand;
import br.com.commandpattern.stereocommand.StereoWithCDCommand;
import br.com.commandpattern.util.Command;
import br.com.commandpattern.util.MacroCommand;
import br.com.commandpattern.util.RemoteControl;

public class RemoteLoader2 {

	public static void main(String[] args) {
		
		final RemoteControl remoteControl = new RemoteControl();
		
		final Light light = new Light("Living Room");
		final Stereo stereo = new Stereo();
		
		final LightOnCommand lightOn = new LightOnCommand(light);
		final LightOffCommand lightOff = new LightOffCommand(light);
		
		final StereoWithCDCommand stereoOn = new StereoWithCDCommand(stereo);
		final StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		final Command[] partyOn = {lightOn, stereoOn};
		final Command[] partyOff = {lightOff, stereoOff};
		
		final MacroCommand partyOnMacro = new MacroCommand(partyOn);
		final MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On ---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("\n--- Pushing Macro Off ---");
		remoteControl.offButtonWasPushed(0);

	}

}
