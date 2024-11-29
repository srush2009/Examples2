import java.util.Scanner;

public class UpperCase {
	static class Validator{
		static boolean validate(String name) {
			return name!=null && name.length()>=3;
		}
	}
	static class Encryptor{
		static String getEncryptedName(String name) throws Exception{
			if(Validator.validate(name)) {
				return reverseAndConventToUpper(name);
			}else {
				throw new Exception("Invalid Input");
			}
		}

		private static String reverseAndConventToUpper(String input) {
			StringBuilder reversed=new StringBuilder();
			for(int i=input.length()-1;i>=0;i--) {
				char currentChar=input.charAt(i);
				if(Character.isUpperCase(currentChar)) {
					reversed.append(Character.toLowerCase(currentChar));
				}else {
					reversed.append(Character.toUpperCase(currentChar));
				}
			}
			return reversed.toString();
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		try {
			String encryptedName=Encryptor.getEncryptedName(name);
			System.out.println(encryptedName);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
