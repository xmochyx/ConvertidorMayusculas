

import java.io.*;
public class principal {

	
	
	public static void main(String[] args)throws IOException {
		//Guarda remotamente git
		
		//Creamos un objeto similar a scanner (BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Declaramos una variable de tipo texto: String
		String texto;
		
		//Pedimos introducir un texto, imprimiendo por pantalla la solicitud
		System.out.print("Escribe algo: ");
			//Se recoge la línea entera que escribimos
			 texto=br.readLine();
			 //Lo transformamos en mayúscula todo lo escrito
			 	texto=texto.toUpperCase();
			 
			 	//ahora imprimimos el resultado
			 System.out.println(texto);
		
		

	}

}
