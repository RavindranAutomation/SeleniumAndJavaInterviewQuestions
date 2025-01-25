package interviewPractice;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		int [] given = {1,1,2,2,3,3,4,4,5,5,6,6};

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();


		for(int i =0;i<given.length;i++) {
			set.add(given[i]);
		}

		System.out.println(set.toString());

	}

}
