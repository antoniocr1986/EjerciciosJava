package iocFicheros;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Repte2 {
    public static void main(String[] args) {
        Repte2 programa = new Repte2();
        programa.inici();
    }
    
    public void inici (){
        File rutaCarpeta = llegirRutaCarpeta();
        netejarCarpeta(rutaCarpeta);
    }
    
    /**
     * Pregunta a l'usuari el nom de la carpeta, i d'aquest obté una ruta.
     *
     * @return La ruta associada al text que ha escrit l'usuari.
     */
    public File llegirRutaCarpeta (){
        //Un tipus compost es pot deixar sense inicialitzar posant "null"
        File f = null;
        boolean preguntar = true;
        Scanner lector = new Scanner(System.in);
        while (preguntar) {
            System.out.println("Escriu el nom d'una ruta en una carpeta: ");
            String nomCarpeta = lector.nextLine();
            f = new File(nomCarpeta);
            if (f.isDirectory()) {
                preguntar = false;
            } else {
                System.out.println("Aquesta carpeta no existeix...");
            }
        }
        return f;
    }

    /**
     * Donada una ruta associada a una carpeta, esborra tot el seu contingut.
     *
     * @param ruta Ruta de la carpeta que cal netejar
     */
    public void netejarCarpeta(File ruta) {
        File[] elements = ruta.listFiles();
        //Cal mirar tots els elements:
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].isFile()) {
                //Si es un fitxer, s'esborra.
                elements[i].delete();
            } else if (elements[i].isDirectory()) {
                //Si és una carpeta, cal buidar-la primer, o sigui: invocar netejarCarpeta!
                netejarCarpeta(elements[i]);
                //Un cop buida, es pot esborrar correctament
                elements[i].delete();
            }
        }
    }
}
