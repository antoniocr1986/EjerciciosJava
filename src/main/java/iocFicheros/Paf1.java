/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iocFicheros;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author anton
 */
public class Paf1 {
    public static void main(String[] args) {
        Paf1 programa = new Paf1 ();
        programa.inici();
    }
    
    public void inici(){
        queFaig("c:/Temp/entrada.txt","c:/temp/sortida.bin",0);
    }
    
    void queFaig(String entrada, String sortida, int max){
        int lin = 1;
        File f = new File (entrada);
        try{
            Scanner scan = new Scanner (f);
            RandomAccessFile raf = new RandomAccessFile (sortida,"rw");
            
            raf.setLength(0);
            
            while(scan.hasNext()){
                int valor = 0;
                int num = scan.nextInt();
                for (int i = 0; i < num; i++) {
                    valor +=scan.nextInt();
                }
                if (valor >=max){
                    valor=max;
                }
                raf.writeInt(lin);
                raf.writeInt(valor);
                lin++;
            }
        raf.close();
        scan.close();
        
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
