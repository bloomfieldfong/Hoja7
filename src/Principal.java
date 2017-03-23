import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.util.Scanner;
/**
 * @author Samantha Duarte 16256
 * @author Michelle Bloomfield Fong 16803
 *
 */
public class Principal {
	
	public static void main(String[] args) throws IOException {
		
		Principal s = new Principal();
		 
		String hola= s.lectura();
		Comparacion calc= new Comparacion(hola);
		System.out.println(calc.operar(hola));
		
		  Scanner scanner = new Scanner(System.in); 
		  System.out.println("Ingrese la palabra en ingles: ");
		  String x = scanner.nextLine();
		  System.out.println("Ingrese la palabra en español: ");
		  String y = scanner.nextLine();
		  
		  
		  /* se agregaran unas palabras x para que se pueda implementa la 
		  el diccionario */
		  Association [] palabra = new Association[10];
		  
		  	  palabra[1] = new Association("hi", "hola");
		  	  palabra[1] = new Association("dog", "perro");
		      palabra[2] = new Association("woman", "mujer");
		      palabra[3] = new Association("men", "hombre");
		      palabra[4] = new Association("yes", "si");
		      palabra[5] = new Association("no", "no");
		      palabra[6] = new Association("eat", "comer");
		      palabra[7] = new Association("town", "peublo");
		      palabra[8] = new Association("homework", "tarea");
		      palabra[9] = new Association("study", "estudiar");
	      
	      
	      //print out each item in the array
	      for (int i = 0; i< palabra.length; i++){
	    	  x = (String) palabra[i].getKey()+", "+palabra[i].getValue();
	    	  BinaryTree<String> RESheldon = new BinaryTree<String>(x);
	    	 
	      }
	}
	//Metodo para leer los archivos .txt
	String lectura() throws IOException{
		
		
		String a = null; 
		
		JFileChooser archivo = new JFileChooser();
		archivo.showOpenDialog(null);
		BufferedReader reader = new BufferedReader(new FileReader(archivo.getSelectedFile().getPath()));
		
		while(reader.ready()){
			a = reader.readLine();
			return a;
		}
		return a;
	
		
	}

}
