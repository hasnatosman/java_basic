
//find the max among three
class method_practice3{
	public static void main(String args[]){
		/*
		int x, y, z;
		x = 5; y = 8; z = 2;
		
		if(x > y && x > z){
			System.out.println(x+ " is the max one!");
		}
		else if(y > x && y > z){
			System.out.println(y+ " is the max one!");
		}
		else{
			System.out.println(z+ " is the max one!");
		}
		*/
		
		
		System.out.println(max(6, 2, 3));
	}
	public static int max(int x, int y, int z){
		int max = 0;
		if(x > y && x > z){
			 max = x;
		}
		else if(y > z && y > x){
			max = y;
		}
		else{
			max = z;
		}
		return max;
	}
	
}