package application;

public class Auto {
	private String name;
	private String farbe;
	private int speed;
	private int haftung;
	private int handycap;
	
	
	public Auto(String name, String farbe, int speed, int haftung, int handycap) {
		this.name=name;
		this.farbe = farbe;
		this.speed = speed;
		this.haftung=haftung;
		this.handycap=handycap;
	}
	public String getName() {
		return name;
	}
	public String getFarbe() {
		return farbe;
	}
	public int getSpeed() {
		return speed;
	}
	public int getHaftung() {
		return haftung;
	}
	public int getHandycap() {
		return handycap;
	}
	
	

}
