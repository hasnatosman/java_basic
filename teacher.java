// scope class class_name{}

public class teacher{
	// attribute -->  data_type attribute_name;
	int age;
	double height;
	String first_name;
	String sure_name;
	String subject;
	
	// method ->> scope access_modifier return_type method_name(parameters list*){}
	// parameters ->> data_type parameters_name, .........
	
	public String full_name(){
		return first_name+ " "+sure_name + " is a "+subject + " teacher";
	}
	public teacher(){
		
	}
	// where class name and method name are same is called constructor
	
	public teacher(String subject){
		//this.local_variable = input
		this.subject = subject;
	}
	/*
	public teacher(int age){
		this.age = age;
	}
	*/
	
}