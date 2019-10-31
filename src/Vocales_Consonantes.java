import java.util.Scanner;

public class Vocales_Consonantes {

	public static void same(String word_1, String word_2) {
		int vowels_1=0;
		int vowels_2=0;
		char a;
		char b;
		int sum_1=0;
		int sum_2=0;
		if(word_1.length() == word_2.length()) {
			for(int i=0; i< word_1.length(); i++) {
				a =word_1.charAt(i);
				if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
					vowels_1++;
					sum_1 += i;
				}
			}
			for(int j=0; j< word_2.length(); j++) {
				b =word_2.charAt(j);
				if(b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u') {
					vowels_2++;
					sum_2 += j;
				}
			}
			
			if((vowels_1 == vowels_2) && (sum_1 ==sum_2)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}else {
			System.out.println("NO");
		}
	}
	
	 public static void main(String args[]){
		 
	        Scanner res = new Scanner(System.in);

	        String word_1 = res.nextLine();
	        String word_2 = res.nextLine();
	        
	        same(word_1, word_2);
	        res.close();
	    }
	
}
