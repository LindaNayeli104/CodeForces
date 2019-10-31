import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.ISO;

public class Grapes {
	public static void is_posible(int g, int p, int b,int g_s, int p_s, int b_s) {
		if(g_s>= g) {
			if((g_s + p_s) >= (g+ p)) {
				if((g_s + p_s + b_s)>=  (g + p + b)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else {
				System.out.println("NO");
			}
		}else {
		System.out.println("NO");
		}
	}
	
	public static void main(String args[]){
	
        Scanner res = new Scanner(System.in);

        
        int g = res.nextInt();
        int p = res.nextInt();
        int b = res.nextInt();
        
        int g_s = res.nextInt();
        int p_s= res.nextInt();
        int b_s = res.nextInt();

       
        is_posible(g, p, b, g_s, p_s, b_s);

       
    
        res.close();


    }
}
