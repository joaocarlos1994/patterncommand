package br.com.commandpattern.stereocommand;

import br.com.commandpattern.domain.Stereo;
import br.com.commandpattern.util.Command;

public class StereoOffCommand implements Command {
	
	private final Stereo stereo;
	
	public StereoOffCommand(final Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		System.out.print(stereo.off());
	}

	@Override
	public void undo() {
		stereo.on();
	}

}
