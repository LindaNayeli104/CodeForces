import java.util.Scanner;

public class Negatives_positives {
	public static int sum(int a, int b) {

		int res = 0;
		if(a==b) {
			if(a%2 == 0) {
				return a;
			}else {
				return (-1*a);
			}
		}else {
			for(int j = a ; j <= b; j++) {
				res += j * Math.pow(-1, j);
			}
			return res;
		}
	 }
		

	}
	
	
	public static void main(String[] args) {
		Scanner res = new Scanner(System.in);

        int x = res.nextInt();
       
        int[] lista = new int[x*2];
        
        for(int i=0; i<x; i++) {
        	int a =  res.nextInt();
        	int b =  res.nextInt();
        	lista[i] = sum(a, b);
        }

        for (int i =0 ; i < x; i++){
        	System.out.println(lista[i]);
        }
       
        
      
        res.close();
	}
}

//----------------------------
import java.util.ArrayList;
import java.util.Scanner;

public class Digits_dividing {
	public static ArrayList<String> sol(int n, String num) {
		ArrayList<String> list = new ArrayList<>();
		String word="";
		if(n> 2) {
			list.add("YES");
			list.add("2");
			word += num.charAt(0)+ " ";
			for(int i=1; i<num.length(); i++) {
				word += (num.charAt (i)+"");
			}
			list.add(word);
			return list;
		}else if(n==2) {
			if(num.charAt(0) == num.charAt(1)) {
				list.add("NO");	
				return list;
			}else if (num.charAt(0) > num.charAt(1)) {
				list.add("NO");
				return list;
			}else if(num.charAt(0) < num.charAt(1)) {
				list.add("2");
				word += num.charAt (0)+ " " + num.charAt(1);
				list.add(word);
				return list;
			}
		}
		return list;
	}
	
	public static void main(String args[]){
        Scanner res = new Scanner(System.in);
        int times = res.nextInt();
        
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        for (int i = 0; i< times; i++){
            int n = res.nextInt();
            int num = res.nextInt();
            result.add(sol(n,Integer.toString(num)));
        }

        for(ArrayList<String> x:result){
        	for(String y:x) {
        		System.out.println(y);
        	}
        }
 
        res.close();
	}
}
