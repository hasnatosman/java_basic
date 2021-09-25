public class Software1{
	public static void main(String args[]){
		User hasnat = new User();
		hasnat.first_name = "Hasnat";
		hasnat.last_name = "Osman";
		hasnat.email = "hasnatosman@gmail.com";
		hasnat.password = Utility.generate_password(hasnat.first_name);
		
		System.out.println(hasnat.first_name);
		System.out.println(hasnat.last_name);
		System.out.println(hasnat.email);
		System.out.println(hasnat.password);
	}
}