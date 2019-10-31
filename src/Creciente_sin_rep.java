import java.util.Scanner;

public class Creciente_sin_rep {
	public static int erased(int num, int[] nums) {
		int res=0;
		int amount = 1;
		for(int i=0; i<nums.length-1;i++) {
			if(nums[i+1] > nums[i]) {
				amount++;
			}else if(nums[i+1] == nums[i]) {
				
				if(amount >1) {
					if(amount > res) {
						res = amount;
						amount =1;
					}
					else {
						amount =1;
					}
				}
			}else{
				if(amount >1) {
					if(amount > res) {
						res = amount;
						amount =1;
					}
					else {
						amount =1;
					}
				}
			}
		}
		
		if(res < amount) {
			res = amount;
			amount =1;
			return res;
		}
		else {
			amount =1;
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