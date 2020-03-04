package patterns;

public class ReversePyramid {
	
	public static void main(String[] args) {
		int j;
		for(int i=0;i<5;i++) {
			for(j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			
			for(int k =0;k<=i;k++) {
				System.out.print("*");
			}			
			System.out.println();			
		}
		
		for(int i=4;i>0;i--) {
			for(j=0;j<=4-i;j++) {
				System.out.print(" ");
			}
			
			for(int k =0;k<i;k++) {
				System.out.print("*");
			}			
			System.out.println();			
		}
		
		
	}

}
