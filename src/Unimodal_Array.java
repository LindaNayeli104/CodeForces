import java.util.Scanner;
public class Unimodal_Array {
	
	public static String is_unimodal(int amount, int[] nums) {
		int mayor = 0;
		boolean ban_may = true;
		boolean ban_menor= false;
		
		for(int i=0; i<nums.length; i++) {
			
			if(mayor == nums[i] && ban_menor) {
				return "NO";
			}
			
			if(nums[i] > mayor && ban_may) {
				mayor = nums[i];
			}
			else if(nums[i] == mayor) {
				mayor = nums[i];
				ban_may = false;
			}
			else if(nums[i] < mayor) {
				ban_menor = true;
				ban_may = false;
				mayor = nums[i];
			}else {
				return "NO";
			}
		}
		return "YES";	
	}	
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);

        int x = res.nextInt();
        int [] lista = new int [x];

        for (int i = 0; i < x; i++){
            int num = res.nextInt();
            lista[i] = num;
        }


        System.out.println(is_unimodal(x, lista));
        res.close();


    }
}
