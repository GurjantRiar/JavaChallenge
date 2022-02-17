package com.bootcamp.test;

public class Farmer {

	private String name;
	private Integer strength=75;
	private Integer health=100;
	private Integer speed=10;
	private Integer attackPower=1;
	private Boolean running=false;
	private Boolean arrested=false;
	private Boolean plowing = false;
	private Boolean harvesting=false;
	
	public void attack(String name) {
		System.out.println("Attacked character "+name);
	}
}
