package com.btc.Inheritence1;

public class Bus extends Vehicle
{
private int capacity;

public void horn()
{
	System.out.println("bus makes the horn");
}

public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}
}
