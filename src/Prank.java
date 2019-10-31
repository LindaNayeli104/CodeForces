import java.util.Scanner;

public class Prank {
	public static int erased(int num, int[] nums) {
		int cur = 0;
		int cur_n = 1;
		int sum = 0;
		int res=0;
		boolean neg = false;
		boolean neg_2 = false;
		while(cur_n != nums.length) {
			if(nums[cur_n]-nums[cur] == 1) {
				sum++;
				cur++;
				cur_n++;
				neg = true;
			}
			else if(nums[cur_n]-nums[cur] != 1) {  //&& sum >= 2
				//res = res + (sum-1);
				neg= false;
				neg_2 = true;
				if(sum>=2) {
					return sum-1;
				}else if(sum == 0) {
					cur++;
					cur_n++;
				}	
				else if(sum == 1) {
					cur++;
					cur_n++;
					sum = 0;
				}	
			}
		}
		if(neg_2==false) {
			res = sum;
			return res;	
		}
			
		if(neg) {
			res = sum;
			return res-1;	
		}else {
			res = sum;
			return res;	
		}
	
		
	}
	
	 public static void main(String args[]){
	        Scanner res = new Scanner(System.in);

	        int x = res.nextInt();
	        int [] lista = new int [x];

	        for (int i = 0; i < x; i++){
	            int num = res.nextInt();
	            lista[i] = num;
	        }
	        
	        System.out.println(erased(x, lista));
	        res.close();


	    }
		
	
}
