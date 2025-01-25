package interviewProgramsWithLogics;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromAString {
	
//Logic:
//1. Covert a String into lowercase
//2. Covert the String into charArray
//4. To maintain insertion order and removing of duplication, use LinkedHashSet
//5. Create an object for LinkedHashSet and pass the generics as Character
//6. Iterate the charArray using for loop
//7. Inside the loo use the set variable and use add method
//8. Inside the add method pass the argument as charArary[i]
//9. Now all values are stored in set object
//10. Use foreach for iterate the set object tehn print the output

	public static void main(String[] args) {

		String given = "India";
		String lowerCase = given.toLowerCase();

		char[] charArray = lowerCase.toCharArray();

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			set.add(charArray[i]);
		}

		for (Character character : set) {
			System.out.print(character);
		}
	}

}
