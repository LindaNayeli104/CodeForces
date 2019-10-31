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
