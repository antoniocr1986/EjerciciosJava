package iocFicheros;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author anton
 */

public class Repte1 {
    public static void main(String[] args) {
        Repte1 programa = new Repte1 ();
        programa.inici();
    }
    
    public void inici(){
        File ruta = llegirNomFitxer ();
        //Cal comprovar si realment existeix i si és un fitxer
        if (ruta.isFile()){
            File novaRuta = treureExtensio(ruta);
            //Es canvia el nom
            ruta.renameTo(novaRuta);
            System.out.println("Nom canviat de "+ruta+ " a "+ novaRuta);
        }else{
            System.out.println("Aquest fitxer no existeix!");
        }
    }
    
    public File llegirNomFitxer(){
        Scanner lector = new Scanner (System.in);
        System.out.println("Escriu el nom d'una ruta en un fitxer existent: ");
        String nomFitxer = lector.nextLine();
        //Fixeu-vos com és possible fer return d'una variable tipus File,
        //igual que es faria per un enter o una cadena de text.
        File f = new File(nomFitxer);
        return f;
    }
    /*Donada una ruta, en crea una nova de igual, però sense extenssió (.xxx)
    *
    *@param original Ruta original que cal transformar
    *@return La ruta sense extensió
    */
    public File treureExtensio (File original){
        String nom = original.getName();
        String pare = original.getParent();
        //Cerquem el darrer punt, per trobar l'extensió
        int posicioPunt = nom.lastIndexOf(".");
        if (posicioPunt >=0){
            //eliminem el que hi ha darrera del punt
            String nouNom = nom.substring(0,posicioPunt);
            //Es fa el text per a la nova ruta, sense extensió
            String nouText = pare + File.separator + nouNom;
            File novaRuta = new File(nouText);
            return novaRuta;
        }else{
            //Si no té extensió, es deixa tot igual..
            return original;
        }
    }
    
}
