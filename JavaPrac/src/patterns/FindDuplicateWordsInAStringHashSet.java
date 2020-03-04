package patterns;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateWordsInAStringHashSet {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");
		
		HashSet<String> setOfString = new HashSet<>();
		HashSet<String> duplicateWords = new HashSet<>();
		for(int i=0;i<words.length;i++) {
			
			if(!setOfString.add(words[i])) {
				duplicateWords.add(words[i]);
			}			
		}
		
		//Iterator<String> itr = duplicateWords.iterator();
		
		for(String temp:duplicateWords) {
			System.out.print(temp+" ");
		}
		sc.close();	
	}

}
