class positive_even{
	public static void main(String args[]){
		int num = 0;
		if (num >= 0){
			if(num % 2 == 0){
				System.out.println(num+" is an even number!");
			}
			else{
				System.out.println(num+" is an odd number!");
			}
		}
		else{
			System.out.println(num+" is a negetive number!");
		}
	}
}