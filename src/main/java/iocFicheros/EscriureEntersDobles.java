package iocFicheros;
import java.io.File;
import java.io.PrintStream;

/**
 *
 * @author anton
 */


public class EscriureEntersDobles {

    public static final int NUM_VALORS = 20;

    public static void main(String[] args) {
        EscriureEntersDobles programa = new EscriureEntersDobles();
        programa.inici();
    }

    public void inici() {
        try {
//S'intenta obrir el fitxer
            File f = new File("c:/Temp/Enters.txt");
            PrintStream escriptor = new PrintStream(f);
//S'escriu el primer valor, que no necessita un espai abans
            int valor = 1;
            escriptor.print(valor);
            int acumulador =0;
//Es van generant la resta de valors i escrivint
            for (int i = 1; i < 20; i++) {
//S'escriu abans com delimitador un espai en blanc
                if ((acumulador>4)&&(acumulador%5 ==0)){
                    escriptor.println("");
                }else{
                escriptor.print(" ");
                }
//Es calcula i escriu el nou valor
                valor = valor * 2;
                escriptor.print(valor);
                acumulador ++;
            }
//Cal tancar el fitxer
            escriptor.close();
            System.out.println("Fitxer escrit satisfactòriament.");
        } catch (Exception e) {
//Excepció!
            System.out.println("Error: " + e);
        }
    }
}
