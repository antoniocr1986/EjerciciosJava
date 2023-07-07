package iocFicheros;

import java.io.File;
import java.util.Scanner;

public class LlegirMarcaFi {

    public static final int MARCA_FI = -100;

    public static void main(String[] args) {
        LlegirMarcaFi programa = new LlegirMarcaFi();
        programa.inici();
    }

    public void inici() {
        try {
//S'intenta obrir el fitxer
            File f = new File("c:/Temp/EntersMarca.txt");
            Scanner lector = new Scanner(f);
//Aquesta estratègia es basa en un semàfor
            boolean llegir = true;
//Si s'executa aquesta instrucció, s'ha obert el fitxer
            while (llegir) {
                int valor = lector.nextInt();
                if (valor == MARCA_FI) {
//Marca de finalització. Ja s'ha acabat la lectura
                    llegir = false;
                } else {
//Encara no s'ha acabat. Tractar dada
                    System.out.println("El valor llegit és: " + valor);
                }
            }
//Cal tancar el fitxer
            lector.close();
        } catch (Exception e) {
//Excepció!
            System.out.println("Error: " + e);
        }
    }
}
