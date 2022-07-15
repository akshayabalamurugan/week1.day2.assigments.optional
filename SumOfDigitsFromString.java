package week1.day2.assignments.optional;
public class SumOfDigitsFromString {
	public static void main(String[] args) {
		String text = "Tes12Le79af65@";
		int sum = 0;
		char[] textArray = text.toCharArray();
		for (int i = 0; i < textArray.length; i++) {
			if (Character.isDigit(textArray[i])) {
				int number = Character.getNumericValue(textArray[i]);
				sum = sum + number;
			}
		}
		System.out.println(sum);
	}
}
