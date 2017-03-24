import java.util.Scanner;
import java.io.*;

public class Holi {

	public String leerTexto() throws IOException {
		// TODO Auto-generated constructor stub
		// Para leer del archivo de texto
		
		File file = new File("texto.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			stringBuffer.append(line);
			stringBuffer.append("\n");
		}
		fileReader.close();
		
		return stringBuffer.toString();
	}
	
	public String traduccion(String text){
		String traduccion = "";
		text = text.toLowerCase();
		String texto[] = text.split("\\s*");
		
		
		return traduccion;
		
		
	}
}

	