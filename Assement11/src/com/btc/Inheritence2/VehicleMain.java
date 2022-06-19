package com.btc.Inheritence2;

public class VehicleMain 
{
public static void main(String[] args) 
{
Bus b = new Bus();
b.setCapacity(40);
System.out.println(b.getCapacity());
b.regno="1234";
b.name="volvo";
System.out.println(b.regno);
System.out.println(b.name);

Car c = new Car();
c.play();
c.setMusicSystem("jbl music System");
System.out.println(c.getMusicSystem());
System.out.println(c.regno);
System.out.println(c.name);

Bike b1 = new Bike();
b1.acclerate();
b1.setAbs(true);
System.out.println(b1.isAbs());	

}
}
