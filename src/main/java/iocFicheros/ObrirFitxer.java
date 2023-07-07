package iocFicheros;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author anton
 */

public class ObrirFitxer {

    public static void main(String[] args) {
        ObrirFitxer programa = new ObrirFitxer();
        programa.inici();
    }

    public void inici() {
        int valorMax = 0;
        try {
        //Bloc "try": operacions d'entrada / sortida
        //S'intenta obrir un fitxer per a lectura
            File f = new File("c:/Temp/Document2.txt");
            Scanner lector = new Scanner(f);
        //El fitxer existeix. Tot correcte
            System.out.println("Fitxer obert correctament.");
            System.out.println("Enhorabona!");
            
            for (int i = 0; i <20; i++) {
                int valor =lector.nextInt();
                System.out.println(valor);
                if (valor>valorMax){
                    valorMax=valor;
                }
            }
            //Cal tancar el fitxer
            lector.close();
            
                     
        } catch (Exception e) {
        //Bloc "catch": Tractament d'errors
        //S'ha produït una excepció en algun lloc del bloc "try"!
            System.out.println("Error: " + e);
        }
        //Les instruccions fora de la sentència "try/catch" sempre s'executen
        //Igual que les que hi ha després d'una sentència "if/else"
        System.out.println("El valor maxim es: "+valorMax);
        System.out.println("Finalització del programa...");
    }
}
