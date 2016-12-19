package br.com.commandpattern.domain;

public class CeilingFan {
	
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	private final String ceilingFan;
	private int speed;
	
	public CeilingFan(final String ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
		this.speed = OFF;
	}
	
	public void hight() {
		this.speed = HIGH;
	}
	
	public void medium() {
		this.speed = MEDIUM;
	}
	
	public void low() {
		this.speed = LOW;
	}

	public String getCeilingFan() {
		return ceilingFan;
	}
	
	public String on() {
		return "O ventilador esta ligado";
	}
	
	public String off() {
		this.speed = OFF;
		return "O ventilador esta desligado ";
	}

	public int getSpeed() {
		return speed;
	}
}
