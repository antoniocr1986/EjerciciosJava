package iocFicheros;
import java.io.*;

/**
 *
 * @author anton
 */

public class CommutadorCarpetes {
    public static void main(String[] args) {
        CommutadorCarpetes programa = new CommutadorCarpetes ();
        programa.inici();
    }
    
    public void inici(){
        File f = new  File("Temp");
        if (f.isDirectory()){
            boolean ok = f.delete();
            if (ok){
                System.out.println("S'ha esborrat la carpeta " + f.getAbsolutePath());
            } else {
                System.out.println("Error esborrarnt la carpeta " + f.getAbsolutePath());
            }
        }else{
            boolean ok = f.mkdir();
            if (ok){
                System.out.println("S'ha creat la carpeta "+f.getAbsolutePath());
            }else {
                System.out.println("Error creant la carpeta "+f.getAbsolutePath());
            }
        }
    }
}