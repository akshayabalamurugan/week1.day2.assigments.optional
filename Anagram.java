package week1.day2.assignments.optional;
import java.util.Arrays;
public class Anagram {
	public boolean isboolean () {
		boolean isAnagram =false;
		String text1 = "Young lady";
		String text2 = "an old guy"; 
		char[] text1Array= text1.toCharArray();
		char[] text2Array= text2.toCharArray();
		Arrays.sort(text1Array);
		Arrays.sort(text2Array);
		int lengthArray1= text1Array.length;
		int lengthArray2= text2Array.length;
		if (lengthArray1==lengthArray2) {
			for (int i = 0; i < text2Array.length; i++) {
				if (text1Array[i]==text2Array[i]) {
					isAnagram=true;
				} else {
					isAnagram=false;
				}
			}
		} 		
		else {
		isAnagram=false;
		}
		return isAnagram;
	}
	public static void main(String[] args) {
		Anagram x=new Anagram();
		if (x.isboolean()==true) {
			System.out.println("The provided string is an Anagram");
		} else {
			System.out.println("The provided string is not an Anagram");
		}
	}
	}