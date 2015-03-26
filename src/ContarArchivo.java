
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Lombardo
 */
public class ContarArchivo {
    
    public ContarArchivo(){
        
    }
    
    public void obtenerLineas (String archivo) throws IOException{
            
            
            int nLineas=0;
            
            File archivo2 = null;
            FileReader fr = null;
            BufferedReader br = null;
            try {
                archivo2 = new File (archivo);
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);
                
                int cuenta=0;
                
                String linea;
                while((linea=br.readLine())!=null){
                    
                    nLineas++;
                    cuenta += ContarPalabras(linea);
                    System.out.println(linea);
                }
                System.out.println("N° palabras: "+cuenta );
            }
            catch(Exception e){
                System.out.println("El archivo no existe");
            }
            System.out.println("El archivo tiene N° "+nLineas+ " lineas");
            
        }
    static int ContarPalabras(String frase){
		int i=0;
		StringTokenizer palabras = new StringTokenizer(frase);
		while(palabras.hasMoreTokens()){
			i+=1;
                        palabras.nextToken();
		}
		return i;
    }        
}
