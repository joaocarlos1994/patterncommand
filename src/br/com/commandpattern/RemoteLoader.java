package br.com.commandpattern;

import br.com.commandpattern.celingfancommand.CelingFanOnCommand;
import br.com.commandpattern.domain.CeilingFan;
import br.com.commandpattern.domain.GarageDoor;
import br.com.commandpattern.domain.Light;
import br.com.commandpattern.domain.Stereo;
import br.com.commandpattern.garagedoorcommand.GarageDoorUpCommand;
import br.com.commandpattern.lightcommand.LightOffCommand;
import br.com.commandpattern.lightcommand.LightOnCommand;
import br.com.commandpattern.stereocommand.StereoOffCommand;
import br.com.commandpattern.stereocommand.StereoWithCDCommand;
import br.com.commandpattern.util.RemoteControl;

/**
 * A <code>RemoteLoader</code> cria diversos Objetos
 * de Comandos que sao carregados nos slots do controle
 * remoto. Cada objeto de comando encapsula uma solicitacao
 * para um dispositivo de autmocao residencial
 * */
public class RemoteLoader {

	public static void main(String[] args) {
		
		final RemoteControl remoteControl = new RemoteControl();
		
		final Light livingRommLight = new Light("Living Room");
		final Light kitchenLight = new Light("Kitchen");
		final CeilingFan ceilingFan = new CeilingFan("Living Room");
		final GarageDoor garageDoor = new GarageDoor();
		final Stereo stereo = new Stereo();
		
		final LightOnCommand livingRoomLightOn = new LightOnCommand(livingRommLight);
		final LightOffCommand livingRoomLightOff = new LightOffCommand(livingRommLight);
		final LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		final LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		final CelingFanOnCommand ceilingFanOn = new CelingFanOnCommand(ceilingFan);
		final CelingFanOnCommand ceilingFanOff = new CelingFanOnCommand(ceilingFan);
		
		final GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		final GarageDoorUpCommand garageDoorDown = new GarageDoorUpCommand(garageDoor);
		
		final StereoWithCDCommand stereoWithCDCommand = new StereoWithCDCommand(stereo);
		final StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoWithCDCommand, stereoOffCommand);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);

	}

}
