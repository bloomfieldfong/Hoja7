
/**
 * @author Michelle Bloomfield
 * @author Samantha Duarte
 * Metodos tomados de: http://algorithms.tutorialhorizon.com/binary-search-tree-complete-implementation/
 * 
 */
public class Arbol <E extends Comparable<E>>{
	
	public Nodo<E> raiz;

	public Nodo<E> getRaiz(){
		return raiz;
		
	}
	
	public void setRaiz(Nodo<E> raiz){
		this.raiz = raiz;
	}
	
	//Metodo que nos busca en el arbol 
	/**
	 * @param id
	 * @return
	 */
	public E buscar(E id) {
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
	//Inserta un dato en nuestro arbol
	/**
	 * @param id
	 */
	public void insert(E id) {
		Nodo<E> newNode = new Nodo<E>(id);
		if (raiz == null) {
			raiz = newNode;
			return;
		}
		Nodo<E> current = raiz;
		Nodo<E> parent = null;
		while (true) {
			parent = current;
			if (current.data.compareTo(id) > 0) {
				current = current.Left;
				if (current == null) {
					parent.Left = newNode;
					return;
				}
			} else {
				current = current.Right;
				if (current == null) {
					parent.Right = newNode;
					return;
				}
			}
		}
	}
	//Nos muestra que hay en nuestro nodo
	/**
	 * @param root
	 */
	public void display(Nodo<E> root) {
		if (root != null) {
			display(root.Left);
			System.out.print(" " + root.data);
			display(root.Right);
		}
	}
	
	


	
}
