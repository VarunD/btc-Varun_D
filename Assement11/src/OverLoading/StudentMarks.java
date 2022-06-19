package OverLoading;

public class StudentMarks 
{
	

	    /* adding 4 integer values.*/


	    public int calculateMarks(int physics, int chemistry, int maths) 
	    {
	    	int total=physics+chemistry+maths;

	        return total;
	    }

	    /* adding 3 integer values.*/
	    public int calculateMarks(int physics, int chemistry, int maths, int bio) {

	    	int total = physics+chemistry+maths+bio;
	        return total;
	    }

	    /* adding 4 double values.*/
	    public double calculateMarks(double physics, double chemistry, double maths, double bio) {

	    	double total= physics + chemistry + maths+ bio;
	        return total;
	    }

	    /* static method adding 5 float values.*/
	    public static float calculateMarks(float maths, float bio, float physics, float chemistry, float lang) 
	    {
	    	float total = maths + bio + physics + chemistry;

	        return total;
	    }


	    /* adding 4 float values with order changed.*/
	    public float calculateMarks(float maths, float bio, float physics, float chemistry) {



	        return -1;
	    }
	    public static void main(String[] args) 
	    {
	    	StudentMarks s = new StudentMarks();
	    	int a = s.calculateMarks(70, 78, 46);
	    	int b = s.calculateMarks(67, 98, 56, 67);
	    	double c = s.calculateMarks(67.8, 90.0, 65.0,67.0);
	    	float d = calculateMarks(40.9f, 78.6f, 70.7f, 89,6f);
	    	float e = s.calculateMarks(90.0f, 67.8f, 78.9f, 90.0f);
	    	
		}
}
