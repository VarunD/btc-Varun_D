package com.btc.Challenge;

public class Resident 
{
public Resident(String name, int socialSecurity, char gender) {
		super();
		this.name = name;
		this.socialSecurity = socialSecurity;
		this.gender = gender;
	}
private String name;
private int socialSecurity;
char gender;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSocialSecurity() {
	return socialSecurity;
}
public void setSocialSecurity(int socialSecurity) {
	this.socialSecurity = socialSecurity;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Resident [name=" + name + ", socialSecurity=" + socialSecurity + ", gender=" + gender + "]";
}


}
