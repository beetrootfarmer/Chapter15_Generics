package ch15_generics;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Lottery {
	
	static final int MAX = 45;
	static final int LIMIT = 6;
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet <> (6);
		while(set.size() <= LIMIT)
			set.add((int) (Math.random()*MAX) + 1);
		
		System.out.println(set);	// [1, 18, 19, 37, 5, 6, 25]
		
		List<Integer> lotto = new LinkedList<>(set);
		Collections.sort(lotto);
		
		System.out.println(lotto);	// [1, 5, 6, 18, 19, 25, 37]
	} 
}
