/* find the total of all numbers 
those are divisible by 3 but not 5 from 1 to 100*/

class exercise11{
	public static void main(String args[]){
		int i = 1;
		int total = 0;
		
		do{
			if(i % 3 == 0 && i % 5 != 0){
				System.out.println(i);
				total = total + i;
			}
			i++;
		}
		while(i <= 100);
		System.out.println("Total is: "+total);
	}
}