import java.util.Scanner;

public class Parity {

	public static String is_even(int b, int k, int[] nums) {
		Long res = 0L;
		for(int i=0; i<nums.length;i++) {
			res = res +( nums[i] * (long)Math.pow(b, k-(i+1)));
			//System.out.println(nums[i]);
			//System.out.println((long)Math.pow(b, k-(i+1)));
		}
		System.out.println(res);
		if(res%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
		
	}
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);

        int b = res.nextInt();
        int k = res.nextInt();
        int [] lista = new int[(int) k];

        for (int i = 0; i < k; i++){
            int num = res.nextInt();
            lista[i] = num;
        }


       
        //{4,2,3,1,5,1,6,4};
        System.out.println(is_even(b,k, lista));
        res.close();


    }
}
