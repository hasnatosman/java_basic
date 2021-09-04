/* Given value of two sides of a right angle,
 find the hypotenuse*/
 
class exercise4{
	public static void main(String args[]){
		//here, x and y are two sides,z is hypotenuse
		double x, y, z;
		x = Math.pow(5,2);
		y = Math.pow(3,2);
		z = Math.sqrt(x+y);
		System.out.println(z);
	}
}