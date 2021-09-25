public class Utility{
	public static String generate_password(String x){
		return x.toUpperCase() + Math.floor(Math.random()*10);
	}
}