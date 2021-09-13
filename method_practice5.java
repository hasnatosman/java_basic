// find to check the even or odd number

class method_practice5{
	public static void main(String args[]){
		System.out.println(even_odd(11));
			
	}
	public static String even_odd(int x){
		String  result = x+ " ";
		if(x % 2 == 0){
			result = result + "is even!!";
		}
		else{
			result = result + "is odd!!";
		}
		return result;
	}
}