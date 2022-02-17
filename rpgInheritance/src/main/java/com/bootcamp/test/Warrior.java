package com.bootcamp.test;

public class Warrior {

	private String name;
	private Integer strength= 75;
	private Integer health=100;
	private Integer stamina=100;
	private Integer speed=50;
	private Integer attackPower=10;
	private Integer shieldStrength=100;
	private Boolean running=false;
	private Boolean arrested=false;    
        
    public void attack(String name) {
    	System.out.println("Attacked "+name);
    }
}
