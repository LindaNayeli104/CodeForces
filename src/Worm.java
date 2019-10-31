import java.util.*;
public class Worm{
    public static void main(String args[]) {
		Scanner res = new Scanner(System.in);
		
		int pila = res.nextInt();
		int[] espacio = new int[pila];
		
		for (int i = 0; i < pila; i++) {
			espacio[i] = res.nextInt();	
		}
		
		int buenos = res.nextInt();
		int[] etiquetas = new int[buenos];
		
		for (int i = 0; i < buenos; i++) {
			etiquetas[i] = res.nextInt();
		}
		
		int[] arreglo = new int[pila];
		int acum = 0;
		for (int i = 0; i < espacio.length; i++) {
			acum += espacio[i];
			arreglo[i] = acum;
		}		
		
		for (int i = 0; i < etiquetas.length; i++) {
			int index = Arrays.binarySearch(arreglo, etiquetas[i]);
			
			if( index >= 0 && arreglo[index] == etiquetas[i] ) {
				System.out.println(index + 1);
			}else {
				while(index > 1 && arreglo[index] == arreglo[index-1]) {
					index = index -1;
				}
				System.out.println(Math.abs(index));
			}

		}
	}
}

