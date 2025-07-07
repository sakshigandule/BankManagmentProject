package Helper;

public class ValidationUtils {

	public static boolean isValidPhoneNumber(long phone) {
		 int length = String.valueOf(phone).length();
		 
	        return length == 10;
	        
		
	}
	
	public static  boolean isValidAdharNumber(long adhar) {
		 int length = String.valueOf(adhar).length();
		 System.out.println(length);
	        return length == 12;
		
	}
	
	public static boolean isValidAmmount(double amount) {
		if(amount<=0) return false;
		return true;
	}
}
