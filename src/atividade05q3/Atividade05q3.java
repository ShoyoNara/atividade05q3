package atividade05q3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Atividade05q3 {

    /**
     * Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé 
     * tem 1,10 metro e cresce 3 centímetros por ano. Construa um algoritmo 
     * que calcule e imprima quantos anos serão necessários para que Zé 
     * seja maior que Chico
     */
    public static void main(String[] args) {
        
        double chico, ze, anos;
        chico = 1.50;
        ze = 1.10;
        anos = 0;
        
        while(chico >= ze){
            
            chico = chico + 0.02;
            ze = ze + 0.03;
            anos++;
            
            System.out.println("Zé lelé altura: "+ze+ "\nChico Bento Altura: "+chico+"\nAnos: "+anos);
            
        }
        JOptionPane.showMessageDialog(null , "Zé lelé levou: "+anos+" Anos para ser maior que Chico Bento");
        
        
    }
    
}
