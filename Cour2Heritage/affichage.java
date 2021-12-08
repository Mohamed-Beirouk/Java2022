package Cour2Heritage;

import Cour1heritage.TooOldException;
import Cour1heritage.TooYoungException;

public class affichage {

	public affichage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ValidateException, TooYoungException, TooOldException {

		person person = new person("mohamed", Cour2Heritage.person.MALE, 20 );
		try {
			ValidateUtils.checkPerson(person);
			
		} catch (ValidateException ex) {
			
			Exception cause = (Exception) ex.getCause();
			if (cause!=null) {
				
				System.out.println("ne peut pas passer, la cause est : "+cause.getMessage());
				
			}else {
				System.out.println(ex.getMessage());
			}
			
			
		
		}
		
		
		

	}

}
