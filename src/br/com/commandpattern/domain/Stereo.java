package br.com.commandpattern.domain;

public class Stereo {
	
	private String cd;
	private String dvd;
	private String radio;
	private int volume;
		
	public String on() {
		return "Stereo is on";
	}
	
	public String off() {
		return "Stereo is off";
	}

	public void setCd(final String cd) {
		this.cd = cd;
	}

	public void setDvd(final String dvd) {
		this.dvd = dvd;
	}

	public void setRadio(final String radio) {
		this.radio = radio;
	}

	public void setVolume(final int volume) {
		this.volume = volume;
	}
	
	
	
}
