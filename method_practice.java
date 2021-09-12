//Create a function/method to add a and b where a and b are integers.

class method_practice{
	public static void main(String args[]){
		System.out.println(sum(5,6,3));
		System.out.println(sub(9,6));
		System.out.println(mul(9,6));
		System.out.println(div(9,6));
	}
	public static int sum(int a, int b, int c){
		return a + b + c;
	}
	public static int sub(int a, int b){
		return a - b;
	}
	public static int mul(int a, int b){
		return a  * b;
	} 
	public static int div(int a, int b){
		return a / b;
	}
}