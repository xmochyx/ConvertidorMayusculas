

import java.io.*;
public class principal {

	
	
	public static void main(String[] args)throws IOException {
		//Creamos un objeto similar a scanner (BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Declaramos una variable de tipo texto: String
		String texto;
		
		//Pedimos introducir un texto, imprimiendo por pantalla la solicitud
		System.out.print("Introduce un texto para ponerlo en may�sculas: ");
			//Se recoge la l�nea entera que escribimos
			 texto=br.readLine();
			 //Lo transformamos en may�scula todo lo escrito
			 	texto=texto.toUpperCase();
			 
			 	//ahora imprimimos el resultado
			 System.out.println(texto);
		
		

	}

}
