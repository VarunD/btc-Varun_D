package com.btc.Inheritence2;

public class Bike extends Vehicle
{
private boolean abs;

public void acclerate()
{
	System.out.println("accelerating the bike");
}

public boolean isAbs() {
	return abs;
}

public void setAbs(boolean abs) {
	this.abs = abs;
}
}
