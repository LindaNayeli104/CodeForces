import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
 
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
    char[] texto = in.nextLine().toCharArray();
    boolean flag = false;
    String resu="";
 
    for (int j = 0; j < n - 1; j++) {
      if (texto[j] != texto[j + 1]) {
        flag = true;
        resu += texto[j];
        resu+= texto[j + 1];
        break;
      }
    }
    if (flag) {
      System.out.println("YES");
      System.out.println(resu);
    } else {
      System.out.println("NO");
    }
  }
}


/*

import java.util.Scanner;

public class DiverseSubstring {
	
	public static void is_subS(int num, char[] word) {
		boolean flag = true;
		int count = 1;
		if(word.length <= 1) {
			System.out.println("NO");
		}else {
			char first_l = word[0];
			for(int i=1; i<word.length; i++) {
				if(word[i] == first_l) {
					count++;
				}	
			}
			if(count == num) {
				System.out.println("NO");
			}else{
				System.out.println("YES");
				System.out.print(word[0]);
				System.out.println(word[1]);
				
			}
		}
	}
	
	public static void main(String args[]){
		
        Scanner res = new Scanner(System.in);
        int x = Integer.parseInt(res.nextLine());
        char[] word = res.nextLine().toCharArray();
        
        is_subS(x, word);
    
        res.close();
     
    }
	
}


*/


import java.util.Scanner;

public class Prank {
	public static int erased(int num, int[] nums) {
		int cur = 0;
		int cur_n = 1;
		int sum = 0;
		int res=0;
		boolean neg = false;
		while(cur_n != nums.length) {
			if(nums[cur_n]-nums[cur] == 1) {
				sum++;
				cur++;
				cur_n++;
			}
			else if(nums[cur_n]-nums[cur] != 1) {  //&& sum >= 2
				//res = res + (sum-1);
				neg = true;
				if(sum>=2) {
					return sum-1;
				}else if(sum == 0) {
					cur++;
					cur_n++;
					neg = false;
				}	
				else if(sum == 1) {
					cur++;
					cur_n++;
					sum = 0;
					neg = false;
				}	
			}
		}
		if(neg) {
			res = sum;
			return res;	
		}else {
			res= sum;
			return res-1;
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
