package program3;

public class Employeee {
	private String ename;
	private int id;
	private double sal;
	public Employeee()
	{
		
	}
	public Employeee(String ename, int id, double sal) {
		super();
		this.ename = ename;
		this.id = id;
		this.sal = sal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employeee [ename=" + ename + ", id=" + id + ", sal=" + sal + "]";
	}
}
