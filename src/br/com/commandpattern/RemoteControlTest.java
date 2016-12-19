package br.com.commandpattern;

import br.com.commandpattern.domain.Light;
import br.com.commandpattern.lightcommand.LightOnCommand;
import br.com.commandpattern.util.SimpleRemoteControl;

/**
 * Padrao Command: Encapsula uma solicitacao como
 * um objeto, o que lhe permite parametrizar outros
 * objetos com diferentes solicitacoes, enfileirar
 * ou registrar solicitacoes e implementar recursos
 * de cancelamento de operacoes.
 * */
public class RemoteControlTest {

	public static void main(String[] args) {
		
		final Light light = new Light("Light");
		final LightOnCommand lightOnCommand = new LightOnCommand(light);
		final SimpleRemoteControl remoteControl = new SimpleRemoteControl(lightOnCommand);
		remoteControl.buttonWasPressed();

	}

}
