package br.com.commandpattern.domain;

public class Light {
	
	private final String localLigh;
	
	public Light(final String localLigh) {
		super();
		this.localLigh = localLigh;
	}

	public String on() {
		return "A luz esta ligada " + localLigh;
	}
	
	public String off() {
		return "A luz esta desligada" + localLigh;
	}
	
}
