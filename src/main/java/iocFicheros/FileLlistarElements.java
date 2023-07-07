package iocFicheros;

/**
 *
 * @author anton
 */
import java.io.File;

public class FileLlistarElements {

    public static void main(String[] args) {
        FileLlistarElements programa = new FileLlistarElements();
        programa.inici();
    }

    public void inici() {
        File carpeta = new File("C:/Temp");
        File[] arrayElements = carpeta.listFiles();
        System.out.println("El contingut de " + carpeta.getAbsolutePath() + " és:");
//Per recórrer un array, s'usa un bucle
        for (int i = 0; i < arrayElements.length; i++) {
            File f = arrayElements[i];
            if (f.isDirectory()) {
                System.out.print("[DIR] ");
            } else {
                System.out.print("[FIT] ");
            }
            System.out.println(f.getName());
        }
    }
}
