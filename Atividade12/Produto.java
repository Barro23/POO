/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author pb948
 */
public class Produto{     //Produto não e abstract.
    
        private String identificação;
        private double custoDeFabricação;
    
        Produto(String i, double c){
        identificação = i ;
        custoDeFabricação = c ;
        }

        abstract public String toString(); //o toString não esta sobreescrevendo o codigo(overrid faltando).
        abstract public void novoCusto(double nc);

}



