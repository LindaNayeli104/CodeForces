import java.util.Scanner;

public class Rhombus {
 public static int squares(int n) {
	 return (int) (2 * Math.pow(n, 2) - 2 *n + 1);
 }
 
 public static void main(String args[]){
     Scanner res = new Scanner(System.in);

     int x = res.nextInt();
     
     
   System.out.println(squares(x));

     res.close();


 }
}
