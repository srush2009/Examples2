import UpperCase.Validator;

public class Encrypter {
	public static String getEncryptedNAme(String name) {
		Validator v=new Validator();
		if(v.validate(name)) {
			String lowerCase=new String(name).toLowerCase();
			StringBuilder output=new StringBuilder(lowerCase).reverse();
			return output.toString();
		}
		else {
			throw new IllegalArgumentException("Try again with valid name");
		}
	}
}
