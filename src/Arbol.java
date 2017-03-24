
public class Arbol <E extends Comparable<E>>{
	
	public Nodo<E> raiz;

	public Nodo<E> getRaiz(){
		return raiz;
		
	}
	
	public void setRaiz(Nodo<E> raiz){
		this.raiz = raiz;
	}
	
	public E find(E id) {
		Nodo<E> current = raiz;
		while (current != null) {
			if (current.data.equals(id)) {
				return current.data;
			} else if (current.data.compareTo(id) > 0) {
				current = current.Left;
			} else {
				current = current.Right;
			}
		}
		return null;
	}

}
