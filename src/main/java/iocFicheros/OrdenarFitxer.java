package iocFicheros;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class OrdenarFitxer {

    public static void main(String[] args) {
        OrdenarFitxer programa = new OrdenarFitxer();
        programa.inici();
    }

    public void inici() {
//Es llegeixen els valors
        int[] valors = llegirDades("c:/Temp/Enters.txt");
        if (valors != null) {
//S'han pogut llegir les dades correctament
//S'ordenen
            Arrays.sort(valors);
//S'escriuen en un nou fitxer
            escriureArray("c:/Temp/EntersOrdenats.txt", valors);
        } else {
//Ha succeït un error llegint les dades
            System.out.println("Hi ha hagut un error llegint les dades.");
        }
    }

    /**
     * Donat el nom d'un fitxer, llegeix els seus valors i el carrega en un
     * array d'enters.
     *
     * @param nom Nom del fitxer
     * @return Array amb les dades carregades des del fitxer
     */
    public int[] llegirDades(String nom) {
        try {
            File f = new File(nom);
            Scanner lector = new Scanner(f);
            int mida = lector.nextInt();
            int[] dades = new int[mida];
            for (int i = 0; i < mida; i++) {
                dades[i] = lector.nextInt();
            }
            return dades;
        } catch (Exception e) {
//No s'han pogut llegir les dades...
            return null;
        }
    }

    /**
     * Donat un nom de fitxer i un array d'enters, l'escriu en aquest fitxer.
     *
     * @param nom Nom de la ruta del fitxer destinació
     * @param dades Array amb les dades que cal escriure
     */
    public void escriureArray(String nom, int[] dades) {
        try {
//S'intenta crear el fitxer
            File f = new File(nom);
            PrintStream escriptor = new PrintStream(f);
//Primer s'escriu el nombre de valors
            escriptor.print(dades.length);
//S'escriuen els valors de l'array, separats per espais
            for (int i = 0; i < dades.length; i++) {
                escriptor.print(" " + dades[i]);
            }
            System.out.println("Fitxer generat satisfactòriament.");
//Cal tancar el fitxer
            escriptor.close();
        } catch (Exception e) {
//Excepció!
            System.out.println("Error escrivint dades: " + e);
        }
    }
}
