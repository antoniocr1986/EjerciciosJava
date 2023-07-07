package manipulacionarchivos;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author anton
 */

public class ManipulacionArchivos {
    public static void main(String[] args) {
        File file = new File("folder\\miPrimerArchivo.txt");
        try{
            boolean fileCreated = file.createNewFile();
            if (fileCreated){
                System.out.println("El archivo se creo correctamente");
            }else{
                System.out.println("El archivo ya existe");
            }
        }catch (IOException e){
            System.out.println("Excepcion al crear el archivo " + e);
        }
    }
    
}
