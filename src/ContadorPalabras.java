import java.util.StringTokenizer;
import java.io.*;
import java.lang.*;
/**
 * 
 * @author rodrigo lombardo
 * @param frase es la frace en la que se trabajara
 * @param x es el largo de la palabra que podemos buscar
 * @param letra es la letra a buscar
 * @param opcion es la opcion que se ingresa y determina la hacion a realizar
 * 
 * el programa al ser sencillo esta todo dentro del constructor, se utiliza la estructura
 * switch para realizar la accion ingresada.
 * 
 * se utiliza StringTokenizer y charAt para trabajar con la cadena
 */
public class ContadorPalabras {

	public ContadorPalabras(String frase, int x, char letra, int opcion){
            String var_frase=frase;
            
		switch (opcion){
                    case 1:
                        int i=0, v=0, c=0;
                        while(i<= var_frase.length()-1){
                            char caracter = var_frase.charAt(i);
                            if (caracter == 'a' || caracter == 'e' ||
                                    caracter == 'i' || caracter == 'o' ||
                                    caracter == 'u' || caracter == 'A' || 
                                    caracter == 'E' || caracter == 'I' || 
                                    caracter == 'O' || caracter == 'U')
                            {
                                v++;
                            }
                            else if (Character.isLetter(caracter))
                            {
                                c++;
                            }
                            i++;
                            
                        }
                        System.out.println("Vocales: " + v +"Consonantes: " + c);
                        break;
                    case 2:
                        i=0;
                        StringTokenizer palabrasX = new StringTokenizer(var_frase);
                        while(palabrasX.hasMoreTokens()){
                            if (palabrasX.nextToken().length() > x)
                            {
                                i++;
                            }
                            
                        }
                        System.out.println(i + " palabras con " + x + " caracteres");
                        break;
                    case 3:
                        i=0;
                        int l=0;
                        while(l < var_frase.length())
                        {
                            if (var_frase.charAt(l)==letra)
                            {
                                i++;
                            }
                            l++;
                        }
                        System.out.println(i + " Letras " + letra);
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
		}
            
	}
        
	
	/*public int ContarPalabras(String frase){
		
		StringTokenizer palabras= new StringTokenizer(frase);
		while(palabras.hasMoreTokens()){
			i+=1;
                        palabras.nextToken();
		}
		return i;
	}*/
}
