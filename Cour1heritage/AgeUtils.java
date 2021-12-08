package Cour1heritage;

public class AgeUtils {

	public AgeUtils() {
	}
	
	public static void checkAge(int age) throws TooYoungException, TooOldException{
		
		if (age<18)
			{
				throw new TooYoungException("age "+ age + " too goss");
			
			}
		else if (age >40)
			{
			
				throw new TooOldException("age "+ age + " too cheybani");
			
			}
		
		System.out.println("that's normal " + age);
		
		
		
		
	}

}
