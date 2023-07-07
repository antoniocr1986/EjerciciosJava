package manipulacionarchivos;

import java.io.*;

/**
 *
 * @author anton
 */

public class Pruebas_rutas {
    public static void main(String[] args) {
        
        File archivo = new File("src");
        File ruta = new File("C:"+File.separator + "Users"+File.separator +"anton"+File.separator +"Documents");
        
        System.out.println(archivo.getAbsolutePath());
        System.out.println(archivo.exists());
        
        System.out.println(ruta.getAbsolutePath());
        
        
        //Almacenamos en el array la lista de ficheros en la ruta ruta
        String [] nombres_archivos = ruta.list();
        
        for (int i = 0; i <nombres_archivos.length; i++) {
            System.out.println(nombres_archivos[i]);
            
            File f = new File(ruta.getAbsolutePath(),nombres_archivos[i]);
            
            if (f.isDirectory()){
                String [] carpeta_interior = f.list();
                
                for (int j = 0; j < carpeta_interior.length; j++) {
                    System.out.println(carpeta_interior[j]);
                }
            }
        }
    }
    
}
