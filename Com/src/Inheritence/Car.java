package Inheritence;

public class Car extends Vehicle 
{
private String musicSystem;

public void play()
{
	System.out.println("car have the music system");
}

public String getMusicSystem() {
	return musicSystem;
}

public void setMusicSystem(String musicSystem) {
	this.musicSystem = musicSystem;
}

}
