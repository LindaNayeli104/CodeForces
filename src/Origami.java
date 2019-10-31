import java.util.Scanner;

public class Origami {
	public static void num_note(int friends, int sheets) {
		
		int t_r = (2*friends);
		int t_g = (5*friends);
		int t_b = (8*friends);
		
		if(t_r% sheets != 0) {
			t_r = t_r/sheets;
			t_r ++;
		}else {
			t_r = t_r/sheets;
		}
		if(t_g% sheets != 0) {
			t_g = t_g/sheets;
			t_g ++;
		}else {
			t_g = t_g/sheets;
		}if(t_b% sheets != 0) {
			t_b = t_b/sheets;
			t_b ++;
		}else {
			t_b = t_b/sheets;
		}
		
		System.out.println(t_r+t_g+t_b);
	}
	
	public static void main(String[] args) {
		 Scanner res = new Scanner(System.in);

	        int friends = res.nextInt();
	        int sheets = res.nextInt();
	       
	        num_note(friends, sheets);
	        res.close();
	}
}
