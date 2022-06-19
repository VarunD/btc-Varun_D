package Collections;

public class Student1 
{
	private int maths;
	private int physics;
	private int chem;
	private String name;
	private int roll_num;
	
	private int total;

	public Student1(int maths, int physics, int chem, String name, int roll_num) {
		super();
		this.maths = maths;
		this.physics = physics;
		this.chem = chem;
		this.name = name;
		this.roll_num = roll_num;
		
		
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChem() {
		return chem;
	}

	public void setChem(int chem) {
		this.chem = chem;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_num() {
		return roll_num;
	}

	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}

