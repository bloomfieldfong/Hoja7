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
		Holi texto = new Holi();
		
		System.out.println(texto.leerTexto());
		 
		  Scanner scanner = new Scanner(System.in); 
		  System.out.println("Ingrese la palabra en ingles: ");
		  String x = scanner.nextLine();
		  System.out.println("Ingrese la palabra en español: ");
		  String y = scanner.nextLine();
		  
		  
		  /* se agregaran unas palabras x para que se pueda implementa la 
		  el diccionario */
		  Association [] palabra = new Association[10];
		  
		  	  palabra[0] = new Association("hi", "hola");
		  	  palabra[1] = new Association("dog", "perro");
		      palabra[2] = new Association("woman", "mujer");
		      palabra[3] = new Association("men", "hombre");
		      palabra[4] = new Association("yes", "si");
		      palabra[5] = new Association("no", "no");
		      palabra[6] = new Association("eat", "comer");
		      palabra[7] = new Association("town", "pueblo");
		      palabra[8] = new Association("homework", "tarea");
		      palabra[9] = new Association("study", "estudiar");
	      
	     
	}
	

}
