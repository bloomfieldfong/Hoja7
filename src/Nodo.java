
/**
 * @author toshibas
 *
 * @param <E>
 */
public class Nodo <E>{

	public Nodo<E> Right;
	public Nodo<E> Left; 
	public E data;
	
	/**
	 * @param x
	 */
	public Nodo(E x){
		data = x;
	}
	
	/**
	 * @param x
	 */
	public void setRight(E x){
		Right = new Nodo<E>(x);  
	}
	
	/**
	 * @param x
	 */
	public void setLeft(E x){
		Left = new Nodo<E>(x);
	}
	
	public E getValue(){
		return data;
	}
	
	public Nodo<E> getRight(){
		return Right;
	}
	
	public Nodo<E> getLeft(){
		return Left;
	}
	
}
