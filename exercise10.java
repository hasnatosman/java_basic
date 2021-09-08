// find numbers that divisible by 3 from 1 to 100
// using do while

class exercise10{
	public static void main(String args[]){
		int i = 1;
		do{
			if(i % 3 == 0 && i % 2 != 0){
				System.out.println(i);
				
			}
			i++;
		}
		while(i <= 100);
	}
}