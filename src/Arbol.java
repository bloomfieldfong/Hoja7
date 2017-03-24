
public class Arbol <E extends Nodo<E>>{
	
	public Nodo<E> raiz;

	public Nodo<E> getRaiz(){
		return raiz;
		
	}
	
	public void setRaiz(Nodo<E> raiz){
		this.raiz = raiz;
	}
}
