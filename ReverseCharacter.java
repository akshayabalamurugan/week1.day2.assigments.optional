package week1.day2.assignments.optional;
public class ReverseCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "de12ef35777777yu";
		String reverse = "";
		String finput = "";
		for (int i = 0; i < input.length(); i++) {
			char x=input.charAt(i);
			if (Character.isAlphabetic(x)) {
				reverse=reverse+Character.toString(x);
			}	
			else {
				finput=finput+Character.toString(x);
		}
			
		}
		char[] reverseArray= reverse.toCharArray();
		for (int i = reverse.length()-1; i>=0; i--) {
			reverseArray[i]=reverseArray[i];
			System.out.print(reverseArray[i]);	
		}
		System.out.print(finput);
	}
	
	}


