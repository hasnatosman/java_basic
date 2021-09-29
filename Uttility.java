//class university with attribute name,total student,city,shrotcode.
//class student with attribute name,id,university name,email.
//class utility method name generate_email,short_code,id.
//email format s26@bubt.com

public class Uttility{
	public static String generate_email(String x){
		return x.toUpperCase()+Math.floor(Math.random()*100);
	}
	public static String short_code(String y){
		return y+Math.floor(Math.random()*1000);
	}
	public static String id(String z){
		return z+Math.floor(Math.random()*1000000000);
	}
}