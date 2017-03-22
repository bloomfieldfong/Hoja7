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
		
		
		
		  Scanner scanner = new Scanner(System.in); 
		  System.out.println("Ingrese la palabra en ingles: ");
		  String x = scanner.nextLine();
		  System.out.println("Ingrese la palabra en español: ");
		  String y = scanner.nextLine();
		  
		  Association [] classesTaken = new Association[5];
	      classesTaken[0] = new Association(x, y);
	      classesTaken[1] = new Association("Barbara", new Integer(1));
	      classesTaken[2] = new Association("Bill", new Integer(3));
	      classesTaken[3] = new Association("Duane", new Integer(2));
	      classesTaken[4] = new Association("Tom", new Integer(1));

	      
	      
	      //print out each item in the array
	      for (int i = 0; i< classesTaken.length; i++){
	    	  x = (String) classesTaken[i].getKey()+", "+classesTaken[i].getValue();
	    	  BinaryTree<String> RESheldon = new BinaryTree<String>(x);
	    	  System.out.println(REsheldon.value());
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
