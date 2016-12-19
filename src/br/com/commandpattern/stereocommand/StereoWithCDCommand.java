package br.com.commandpattern.stereocommand;

import br.com.commandpattern.domain.Stereo;
import br.com.commandpattern.util.Command;

public class StereoWithCDCommand implements Command {
	
	private final Stereo stereo;

	public StereoWithCDCommand(final Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		System.out.print(stereo.on());
		stereo.setCd("Zezé de Camargo e Luciano");
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
	}

}
