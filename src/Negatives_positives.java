import java.util.Scanner;



public class Negatives_positives {
	public static int sum(int a, int b) {
		int dif = b-a;
		
		if(dif % 2 == 0) {
			dif = (dif/2) + a;
			if(a % 2 == 0) {
				return dif;
			}else {
				return dif * -1;
			}
		}else {
			dif = (dif+1) / 2;
			if(a % 2 == 0) {
				return dif * -1;
			}else {
				return dif;
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

		

	
	
