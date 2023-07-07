package iocFicheros;

import java.io.File;
import java.util.Scanner;
import java.io.PrintStream;

public class LlegirNotes {
//la paraula fi serveix com a marca de final de fitxer

    public static final String MARCA_FI = "fi";
    public static final double MARCA_FI_NOTES = -1;

    public static void main(String[] args) {
        LlegirNotes programa = new LlegirNotes();
        programa.inici();
    }

    public void inici() {
        try {
            File in = new File("C:/Temp/Notes.txt");
            Scanner lector = new Scanner(in);
            File out = new File ("C:/Temp/NotaMitja.txt");
            PrintStream escriptor = new PrintStream (out);
            boolean llegir = true;
            while (llegir) {
                String nom = lector.next();
                if (MARCA_FI.equals(nom)) {
                    llegir = false;
                } else {
                    String cognom = lector.next();
                    escriptor.print("Estudiant: " + nom + " " + cognom);
//Noteu com un scanner es pot passar com paràmetre
                    double mitjana = llegirNotes(lector);
                    escriptor.println("- Mitjana: " + mitjana);
                }
            }
//Cal tancar el fitxer
            lector.close();
            escriptor.close();
            System.out.println("Fitxer escrit satisfactòriament. ");
        } catch (Exception e) {
//Excepció!
            System.out.println("Error llegint estudiants: " + e);
        }
    }

    /**
     * Donat un Scanner en un fitxer quan l'apuntador es troba sobre l'inici de
     * les notes, s'extreuen i es calcula la mitjana.
     *
     * @param lector Scanner a processar
     * @return Mitjana de notes
     */
    public double llegirNotes(Scanner lector) {
        double res = 0;
        try {
//Es fan lectures. Cal controlar excepcions també!
            boolean llegir = true;
            int numNotes = 0;
            while (llegir){
                double valor = lector.nextDouble();
                if (valor ==MARCA_FI_NOTES){ //final
                    llegir= false;
                }else {           //S'acumula el valor de les notes
                    res=res+valor;
                    numNotes++;
                }
            }
//Es calcula nota mitjana
            res = res / numNotes;
        } catch (Exception e) {
//Excepció!
            System.out.println("Error llegint notes: " + e);
        }
        return res;
    }
}
