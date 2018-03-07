
public abstract class NameValidator {
	
	public void isNameAlphanumeric(String name) throws Exception {
		if(!name.matches("^[a-zA-Z][a-zA-z0-9]*$")) {
			throw new Exception(name +"Must start with alphabet and can be alphanumeric");
		}
		
	}
}
