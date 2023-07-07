
package iocFicheros;

/**
 *
 * @author anton
 */


import java.io.File;

public class Reanomenar {

    public static void main(String[] args) {
        Reanomenar programa = new Reanomenar();
        programa.inici();
    }

    public void inici() {
        File rutaOrigen = new File("C:/Temp/Document.txt");
//Reanomenar: mateixa ruta pare però diferent nom final
        String nouNom = rutaOrigen.getParent() + File.separator + "Reanomenat.txt";
        File rutaDesti = new File(nouNom);
        rutaOrigen.renameTo(rutaDesti);
    }
}
