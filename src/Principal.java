
public class Principal {
	
	public static void main (String args[]){
		
		//int nPalabras;
		
		/*ContadorPalabras contar= new ContadorPalabras();
		nPalabras=contar.ContarPalabras("Esto es una frase");
                System.out.println(nPalabras);
		nPalabras=contar.ContarPalabras("a e i o u");
		System.out.println(nPalabras);*/
                //ContadorPalabras contar=new ContadorPalabras("Esto es un test aeiou",4,'t',2);
                
                
                ContarArchivo a = new ContarArchivo();
                String ruta="C:\\texto.txt";
                a.obtenerLineas(ruta);
	}
}
