public class Id_card{
	public static void main(String args[]){
		University varsity = new University();
		varsity.name = "Dhaka University";
		varsity.total_student = "10000";
		varsity.city = "Dhaka";
		varsity.short_code = Uttility.short_code(varsity.name);
		
		U_Student hasnat = new U_Student();
		hasnat.name = "Hasnat";
		hasnat.id = Uttility.id(hasnat.name);
		hasnat.university_name = varsity.name;
		hasnat.email = Uttility.generate_email(hasnat.name);
		
		
		System.out.println(varsity.name);
		System.out.println(varsity.total_student);
		System.out.println(varsity.city);
		System.out.println(varsity.short_code);
		
		System.out.println(hasnat.name);
		System.out.println(hasnat.id);
		System.out.println(hasnat.university_name);
		System.out.println(hasnat.email+"@"+varsity.short_code);
		
	}
}