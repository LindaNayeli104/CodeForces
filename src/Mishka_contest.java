import java.util.Scanner;

public class Mishka_contest {
	
	public static int num_prob(int n,int k, int[] dif) {
		int right = 0;
		int left = dif.length-1;
		
		int res = 0;
		if(dif.length == 0) {
			return res;
		}
		while(dif[right]<=k || dif[left]<=k) {
			if(right == left) {
				if(dif[right] <= k || dif[left] <=k) {
					res +=1;
					return res;
				}
			}
			else if(right<left) {
				if(dif[right] <= k) {
					right += 1;
					res +=1;
				}
				if(dif[left] <=k) {
					left -=1;
					res += 1;
				}
			}
			else {
				return res;
			}	
		}
		return res;
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
        
        String word = res.nextLine();

       
       
        //{4,2,3,1,5,1,6,4};
        System.out.println(num_prob(x , n, lista));
        res.close();


    }
}
