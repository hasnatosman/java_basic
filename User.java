public class User{
	public static void main(String args[]){
	Student tarek = new Student();
	tarek.name = "Tarek";
	tarek.surename = "Saifullah";
	tarek.id = 12;
	tarek.universityCode = "DU";
	tarek.email = Utility.emailGenerator(tarek.universityCode, tarek.id);
	
	//Tareq Saifullah id no 12 of university DU his email is s24@du.com
	
	System.out.println(tarek.name +" "+ tarek.surename + " id no " + tarek.id + " of university "+ tarek.universityCode+" his email is "+ tarek.email);
	System.out.println(tarek.toString());
	
	}
	
}