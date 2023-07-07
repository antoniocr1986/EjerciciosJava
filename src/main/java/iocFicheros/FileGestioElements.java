package iocFicheros;

/**
 *
 * @author anton
 */

package unitat6.apartat1.exemples;
import java.io.File;

public class FileGestioElements {

    public static void main(String[] args) {
        FileGestioElements programa = new FileGestioElements();
        programa.inici();
    }

    public void inici() {
        File fotos = new File("C:/Temp/Fotos");
        File document = new File("C:/Temp/Document.txt");
        boolean resultat = fotos.mkdir();
        System.out.println("Creada carpeta " + fotos.getName() + "? " + resultat);
        if (!resultat) {
            boolean delCarpeta = fotos.delete();
            System.out.println("Esborrada carpeta " + fotos.getName() + "? " + delCarpeta);
            boolean delFitxer = document.delete();
            System.out.println("Esborrat fitxer " + document.getName() + "? " + delFitxer);
        }
    }
}
