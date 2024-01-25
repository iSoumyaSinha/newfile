public class InvalidEmailExceptions  extends Exception {
    public InvalidEmailExceptions(String message) {
        super(message); 
    }
}
class EmailValidator {
    public static void validateEmail(String email) throws InvalidEmailExceptions {
      
        if (!email.contains("@")) {
            throw new InvalidEmailExceptions("Email must contain the '@' symbol");
        }


    
    if (!email.endsWith(".com") && !email.endsWith(".co.in")) {
        throw new InvalidEmailExceptions("Invalid domain extension. Email must end with '.com' or '.co.in'");
    }
    System.out.println(email + " is a valid email address.");
    
}
	public static void main(String[] args) {
		
		
		try {
			validateEmail("user@example.com");
		}
	 catch (InvalidEmailExceptions e) {
        System.out.println("Error: " + e.getMessage());
    }


	}

}
