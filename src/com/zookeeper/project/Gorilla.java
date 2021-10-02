package com.zookeeper.project;

class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public String throwSomething() {
		energyLevel -= 5;
		return "Gorilla has decreased by 5";
	}
	
	public String eatBananas() {
		energyLevel += 10;
		return "Gorilla has eaten a banana, his energy has increased";
	}
	
	public String climb() {
		energyLevel -= 10;
		return "Gorilla has climbed something and lost 10 energy";
	}
}