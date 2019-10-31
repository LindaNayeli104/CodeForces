import java.util.ArrayList;
import java.util.Scanner;

public class Prime_Subtraction {
	
	public static void is_posible(int x,Long[] nums) {
		  for (int i =0 ; i < nums.length-1; i++){
			  if((nums[i] - nums[i+1]) >= 2) {
				  System.out.println("YES");
			  }else {
				  System.out.println("NO");
			  }
			  i++;
		  }
	}
	
    public static void main(String args[]){
    	Scanner res = new Scanner(System.in);

        int x = res.nextInt();
       
        Long[] lista = new Long[x*2];

        for (int i =0 ; i < x*2; i++){
        	 Long a = res.nextLong();
        	 lista[i] = a;
        }
        is_posible(x,lista);
        
      
        res.close();
        
    }
    
}
