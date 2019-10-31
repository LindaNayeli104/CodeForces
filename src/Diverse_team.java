import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class Diverse_team {
	
	public static String team(int n, int k, int[] cal) {
		int len = k;
		String res = "";
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		if(k==0) {
			return "";
		}
		for(int i=0; i<cal.length;i++) {
			if(!hashset.contains(cal[i])) {
				hashset.add(cal[i]);
				res += i+1;
				res += " ";
				k--;
				if(k==0) {
					break;
				}
			}
		}
		if(hashset.size()>= len) {
			return res;
		}else {
			return "";
		}
		
	}
	
	 public static void main(String args[]){ 
	       Scanner res = new Scanner(System.in);

	        int x = res.nextInt();
	        int n = res.nextInt();
	        int [] lista = new int [x];

	        for (int i = 0; i < x; i++){
	            int num = res.nextInt();
	            lista[i] = num;
	        }

	        //{4,2,3,1,5,1,6,4};
	        String  res1 = team(x , n, lista);
	        if(res1 == ""){
	        	System.out.println("NO"); 
	        }else {
	        	System.out.println("YES");
	 	       	System.out.println(res1);
	 	        }
	        res.close();
	 }
	        
}
	
