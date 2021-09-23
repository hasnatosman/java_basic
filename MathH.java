public class MathH{
	public static double max(double x, double y){
		if (x < y){
			return y;
		}else{
			return x;
		}
	}
	
	public static double taka_to_doller(double taka, double doller){
		return taka / doller;
	}
	
	public static double feet_to_meter(double x){
		return x * 0.3048;
	}
	public static double meter_to_feet(double x){
		return x * 3.28084;
	}
	public static double kg_to_pound(double x){
		return x * 2.20462;
	}
	public static double pound_to_kg(double x){
		return x * 0.453592;
	}
}