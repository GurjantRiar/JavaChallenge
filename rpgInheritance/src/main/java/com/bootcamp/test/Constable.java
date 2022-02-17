package com.bootcamp.test;

public class Constable {

	private String name;
	private Integer strength= 60;
	private Integer health=100;
	private Integer stamina=60;
	private Integer speed=20;
	private Integer attackPower=5;
	private Boolean running=false;
	private Boolean arrested=false;
    private String jurisdiction;
    
    public void arrest(String name) {
    	System.out.println("Arrested "+name);
    }
    
    public void attack(String name) {
    	System.out.println("Attacked "+name);
    }
}
