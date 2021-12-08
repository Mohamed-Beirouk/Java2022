package Cour2Heritage;
import Cour1heritage.*;

public class ValidateUtils {

	public static void checkPerson(person person) throws ValidateException, TooYoungException, TooOldException
	{
		
		try {
			
		
//		pour l'age j'ai une methode existant chechAge
		
		AgeUtils.checkAge(person.getAge());
		
			} catch (Exception e){
				
				throw new ValidateException(e);
				
								}
			if(person.getGenre().equals(person.FEMALE)) {
				
				GenderException e = new GenderException("we don't accept women");
				throw new ValidateException(e);	
				
			}
	}

}
