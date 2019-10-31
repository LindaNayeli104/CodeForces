import java.util.Scanner;

public class Text_volume {
 
	public static int volume(int size, String phrase) {
		Character letter;
		int sum = 0;
		int res = 0;
		for(int i=0; i<phrase.length(); i++) {
			letter = phrase.charAt (i);
			if(Character.isUpperCase(letter)) {
				sum++;
			}else if(letter == ' ') {
				if(sum > res) {
					res = sum;
				}
				sum = 0;
			}
		}
		if(sum > res) {
			res = sum;
		}
		return res;
	}
	
public static void main(String args[]){

		
        Scanner res = new Scanner(System.in);
        int x = Integer.parseInt(res.nextLine());
        String word = res.nextLine();
        
        System.out.println(volume(x, word));;
    
        res.close();
     
    }
	
	
	
}