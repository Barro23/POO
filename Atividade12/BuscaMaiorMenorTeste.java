/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13;

/**
 *
 * @author pb948
 */
public class BuscaMaiorMenorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuscaMaiorMenor bmm = new BuscaMaiorMenor(1, 2, 3, 4, 5);
            bmm.setMaior();
            bmm.setMenor();
            System.out.println(bmm.toString());
    }
    
}
