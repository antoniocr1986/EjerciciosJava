package iocFicheros;

import java.io.File;
import java.util.Scanner;

public class MitjanaVocals {
//la paraula "fi" serveix com a marca de final de fitxer

    public static final String MARCA_FI = "fi";

    public static void main(String[] args) {
        MitjanaVocals programa = new MitjanaVocals();
        programa.inici();
    }

    public void inici() {
        try {
//S'intenta obrir el fitxer
            File f = new File("c:/Temp/Document.txt");
            Scanner lector = new Scanner(f);
//Dades a recopilar
            int numParaules = 0;
            int numVocals = 0;
//Marca de finalització de lectura
            boolean llegir = true;
            while (llegir) {
                String paraula = lector.next();
                if (MARCA_FI.equals(paraula)) {
//Marca de final
                    llegir = false;
                } else {
//Tractar dada
                    numParaules++;
                    numVocals = numVocals + comptarVocals(paraula);
                }
            }
            System.out.println("Hi ha " + numParaules + " paraules.");
            System.out.println("Hi ha " + numVocals + " vocals.");
            double mitjana = numVocals / numParaules;
            System.out.println("La mitjana és " + mitjana);
//Cal tancar el fitxer
            lector.close();
        } catch (Exception e) {
//Excepció!
            System.out.println("Error: " + e);
        }
    }

    /**
     * Compta les vocals en una paraula.
     *
     * @param paraula Cadena de text on cal comptar les vocals
     * @return Nombre de vocals
     */
    public int comptarVocals(String paraula) {
        int res = 0;
//Es passa a minúscula tot per fer-ho mes fàcil
        paraula = paraula.toLowerCase();
        for (int i = 0; i < paraula.length(); i++) {
            if (esVocal(paraula.charAt(i))) {
                res++;
            }
        }
        return res;
    }

    /**
     * Diu si, donat un caràcter en minúscula, aquest és o no una vocal.
     *
     * @param c Caràcter a comprovar
     * @return Si és (true) o no (false) una vocal
     */
    public boolean esVocal(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
