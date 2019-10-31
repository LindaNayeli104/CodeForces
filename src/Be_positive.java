import java.util.ArrayList;
import java.util.Scanner;

public class Be_positive {
	
	public static int num_div(int n,int[] dif) {
		int res=0;
		int res_2=0;
		for(int i=0; i<dif.length;i++) {
			if(dif[i] >0) {
				res++;
			}
			else if(dif[i] <0) {
				res_2++;
			}
			
		}
		int comp = 0;
		if(n%2 == 0) {
			comp = n/2;
		}else {
			comp = n/2 +1;
		}
	
		if(res >= comp) {
			return 1;
		}else if(res_2 >= comp){
			return -1;
		}else {
			return 0;
		}
		
		
	}
	
    public static void main(String args[]){
    	int[] lista = {-1, -1, 1, 1,0};
    	 System.out.println(num_div(5,lista));
    
       /* Scanner res = new Scanner(System.in);

        int x = res.nextInt();
        int [] lista = new int [x];

        for (int i = 0; i < x; i++){
            int num = res.nextInt();
            lista[i] = num;
        }
       
        //{4,2,3,1,5,1,6,4};
        System.out.println(num_div(x,lista));
        res.close();
        */
    }
    
}
