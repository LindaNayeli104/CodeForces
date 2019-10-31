import java.util.Scanner;

public class Lottery {
	
	public static int bill(int amount) { //125
		 //1, 5, 10, 20, 100.
		int res=0;
		if(amount/100 > 0) {
			 res += amount/100;
			 amount =amount%100;
		}
		if(amount/20 > 0) {
			 res += amount/20;
			 amount =amount%20;
		}
		if(amount/ 10> 0) {
			 res += amount/10;
			 amount =amount%10;
		}
		if(amount/5 > 0) {
			 res += amount/5;
			 amount =amount%5;
		}
		if(amount/1 > 0) {
			 res += amount/1;
			 amount =amount%1;
		}
		return res;
	}
	
	  public static void main(String args[]){
	        Scanner res = new Scanner(System.in);

	        int x = res.nextInt();
	        
	        
	      System.out.println(bill(x));

	        res.close();


	    }
}
