package Firdt;

public class CalorieTracker 
{
	public static void main(String[] arg)
	{
	    System.out.println("Calorie burnt by cycling = 300");
	    System.out.println("Calorie burnt by running = 500");
	    System.out.println("Calorie burnt by swimming = 200");
	    System.out.println("Calorie intake in a day  : 100");
	    int workFor28_Days=((300*2)+(500*2)+(200*2))*4;
	    //2 days cycling , 2 days swimming and 2 days running
	    int oneDay = workFor28_Days/28;
	    int for2_Day=oneDay*2;
	    int workOut = workFor28_Days+for2_Day;
	    int intake=100*30;
	    int calories=workOut-intake;
	    double weightloss= calories/1000;
	    System.out.println("Weight lost by Anne in a month is = " + weightloss+" pounds");
	}
}
