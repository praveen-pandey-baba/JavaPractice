package patterns;

import java.util.Scanner;

public class ReturnWordsWithSameLetters {
	
	
	public static boolean chk(String s) {
		 int n = s.length(); 
		    for (int i = 1; i < n; i++) {
		    	 if (s.charAt(i) != s.charAt(0)) 
			            return false;
		    }
		        
		          
		    return true; 
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");		
		String str = sc.nextLine();
		String[] words = str.split(" ");
		for(int i = 0;i<words.length;i++) {
			  if (chk(words[i])) { 
			        System.out.println(words[i]); 
			  }			    
		}
		sc.close();
		

	}

}
