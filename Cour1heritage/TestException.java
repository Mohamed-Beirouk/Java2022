package Cour1heritage;

public class TestException {

	
	public static void main(String[] args) 
		{

		System.out.println("debut du bla bla bla");
		
		System.out.println("check ur age");
		
		int age = 25;
		
				try {
						AgeUtils.checkAge(age);
						System.out.println("you pass");
					} catch (TooYoungException e) {
						System.out.println("tu es petit");
						System.out.println(e.getMessage());
					} catch (TooOldException e) {
						System.out.println("tu es cheybani");
						System.out.println(e.getMessage());
						
					}
		
			}

}
