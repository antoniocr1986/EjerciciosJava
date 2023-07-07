package manipulacionarchivos;
import java.io.*;

/**
 *
 * @author anton
 */



public class Eliminar {
    public static void main(String[] args) {
        
        File ruta = new File ("C:"+File.separator + "Users"+File.separator +"anton"+File.separator +"Documents" +File.separator + "prueba.txt");
                
        ruta.delete();
    }
}
