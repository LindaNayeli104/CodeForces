public class Borrar<E extends Comparable<E>>{
	private E[] heap;
	private int size;
	public Borrar() {
		this.heap=(E[])(new Comparable[127]);
		this.size=0;
	}
	public Borrar(E[] arreglo) {
		this.size=arreglo.length;
		this.heap=(E[])(new Comparable[127]);
		E[] arregloInsercion=this.heapify(arreglo);
		for(int i=0; i<arregloInsercion.length; i++) {
			this.heap[i]=arregloInsercion[i];
		}
	}
	public void insert(E value) {
		int indice=this.size;
		this.heap[indice]=value;
		this.size++;
		while(indice>0){
			if(indice%2==0) {
				if(value.compareTo(this.heap[(indice-2)/2])>0) {
					this.heap[indice]=this.heap[(indice-2)/2];
					this.heap[(indice-2)/2]=value;
					indice=(indice-2)/2;
				}else{
					return;
				}
			}else {
				if(value.compareTo(this.heap[(indice-1)/2])>0) {
					this.heap[indice]=this.heap[(indice-1)/2];
					this.heap[(indice-1)/2]=value;
					indice=(indice-1)/2;
				}else {
					return;
				}
			}
		}
	}
	public E[] heapify(E[] arreglo){
		return this.heapify(arreglo,(arreglo.length/2)-1 );
	}
	private E[] heapify(E[] arreglo, int indice) {
		try {
			if(indice*2+2==arreglo.length) {
				E elementoInicio= arreglo[indice];
				E hijoIzquierdo=arreglo[indice*2+1];
				if(hijoIzquierdo.compareTo(elementoInicio)>0) {
					 arreglo[indice]=hijoIzquierdo;
					 arreglo[indice*2+1]=elementoInicio;
					 heapify(arreglo, indice*2+1); 
				 }
				 return heapify(arreglo,indice-1);
			}else {
				 E elementoInicio= arreglo[indice];
				 E hijoIzquierdo=arreglo[indice*2+1];
				 E hijoDerecho=arreglo[indice*2+2];
				 if(hijoIzquierdo.compareTo(hijoDerecho)<0 && hijoDerecho.compareTo(elementoInicio)>0) {
					 arreglo[indice]=hijoDerecho;
					 arreglo[indice*2+2]=elementoInicio;
					  heapify(arreglo,indice*2+2); 
				 }else if((hijoIzquierdo.compareTo(hijoDerecho)>0|| hijoIzquierdo.compareTo(hijoDerecho)==0) && hijoIzquierdo.compareTo(elementoInicio)>0) {
					 arreglo[indice]=hijoIzquierdo;
					 arreglo[indice*2+1]=elementoInicio;
					 heapify(arreglo, indice*2+1); 
				 }
				 return heapify(arreglo,indice-1);
			}
		}catch(IndexOutOfBoundsException ex) {
			return arreglo;
			 
		 }
	}
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		if(this.size==0) {
			return true;
		}else{
			return false;
		}
	}
	public E delete() {
		E res=this.heap[0];
		this.heap[0]=this.heap[this.size-1];
		this.heap[this.size-1]=null;
		this.size--;
		int indice=0;
		try {
			while(true) {
				 E hijoIzquierdo=this.heap[indice*2+1];
				 E hijoDerecho=this.heap[indice*2+2];
				if((hijoIzquierdo.compareTo(hijoDerecho)>0|| hijoIzquierdo.compareTo(hijoDerecho)==0) && hijoIzquierdo.compareTo(this.heap[indice])>0) {
					E auxiliar=this.heap[indice];
					this.heap[indice]=this.heap[indice*2+1];
					this.heap[indice*2+1]=auxiliar;
					indice=indice*2+1;
				}else if(hijoIzquierdo.compareTo(hijoDerecho)<0 && hijoDerecho.compareTo(this.heap[indice])>0) {
					E auxiliar=this.heap[indice];
					this.heap[indice]=this.heap[indice*2+2];
					this.heap[indice*2+2]=auxiliar;
					indice=indice*2+2;
				}else {
					return res;
				}
			}
		}catch(NullPointerException ex) {
			return res;
		}
	}
	public String toString() {
		String res="";
		for(int i=0; i<this.size-1; i++) {
			res+=this.heap[i]+",";
		}
		res+=this.heap[this.size-1];
		return res;
	}
	public static void main(String[] args) {
		Integer[] array = {15,60,72,70,56,32,62,92,45,30,65};
		Borrar<Integer> heap = new Borrar<Integer>(array);
		System.out.println(heap.toString());
		heap.delete();
		System.out.println(heap.toString());
	}

}