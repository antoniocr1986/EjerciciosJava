package iocFicheros;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author anton
 */

public class ScannerFicheros {
    public static void main(String[] args) {
        ScannerFicheros programa = new ScannerFicheros();
        programa.inici();
        programa.imprimirFitxer();
    }
        
    public void inici(){
        try{
            File fitxer = new File("C:/Temp/Document.txt");
            Scanner lectorFitxer = new Scanner(fitxer);
            System.out.println("Fitxer obert correctament");
            lectorFitxer.close();
        }catch (IOException e){
            System.out.println("No s'ha trobar el fitxer");
        }
        System.out.println("Finalització del metode inici...");
    }
    
    public void imprimirFitxer(){
        try{
            File fitxer2 = new File("C:/Temp/Document.txt");
            PrintStream escriptorFitxer = new PrintStream(fitxer2);
            System.out.println("Fitxer2 trobat correctament");
            int valor = 19;
            String textDocument = "El primer text escrit a fitxer.";
            escriptorFitxer.print(textDocument);
            escriptorFitxer.close();
            System.out.println("Fitxer escrit satisfactoriament");
        }catch(IOException e){
            System.out.println("No s'ha pogut trobar el fitxer2");
        }
    }
}

