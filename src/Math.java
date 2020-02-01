
public class Math{
	
	public static double min(double x, double y){
		double min = x < y ? x : y;
		System.out.printf("The lowest value is %.2f", min);
		return min;
	}

}
