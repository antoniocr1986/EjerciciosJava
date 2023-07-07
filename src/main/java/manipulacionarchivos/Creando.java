package manipulacionarchivos;
import java.io.*;

/**
 *
 * @author anton
 */

public class Creando {
    public static void main(String[] args) {
         File ruta = new File("C:"+File.separator + "Users"+File.separator +"anton"+File.separator +"Documents" +File.separator + "prueba.txt");
         
         String archivo_destino = ruta.getAbsolutePath();
         
         try{
            ruta.createNewFile();
         }catch (IOException e){
             e.printStackTrace();
         }
         
         Escribiendo accede_es = new Escribiendo();
         
         accede_es.escribir(archivo_destino);
    }
}

class Escribiendo{
    public void escribir(String ruta_archivo){
        
        String frase="Esto es un ejemplo. Espero que salga";
    
        try{
            FileWriter escritura = new FileWriter(ruta_archivo);
            
            for (int i = 0; i <frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            escritura.close();
            
        }catch(IOException e){
            
        }
    }
}