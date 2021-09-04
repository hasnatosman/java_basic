//Given x, find -x3+x2+x.

class exercise6{
	public static void main(String args[]){
		double x = 2;
		double x3 = Math.pow(x, 3);
		double x2 = Math.pow(x, 2);
		double result = -x3+x2+x;
		
		System.out.println("Result is: "+result);
		
	}
}