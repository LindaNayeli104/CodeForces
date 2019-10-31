import java.util.Scanner;

public class DiverseSubstring {
	
	public static void is_subS(int num, char[] word) {
		int count = 1;

		if(word.length <= 1) {
			System.out.println("NO");
		}else {
			char first_l = word[0];
			for(int i=1; i<word.length; i++) {
				if(word[i] == first_l) {
					count++;
				}
			}
			if(count == num) {
				System.out.println("NO");
			}else{
				System.out.println("YES");
				int j=0;
				
				while(word[j] == word[j+1]) {
					j= j+1;
				}
				
				System.out.print(word[j]);
				System.out.println(word[j+1]);
				
			}
		}
	}
	
	public static void main(String args[]){
		
        Scanner res = new Scanner(System.in);
        int x = Integer.parseInt(res.nextLine());
        char[] word = res.nextLine().toCharArray();
        
        is_subS(x, word);
    
        res.close();
     
    }
	
}
