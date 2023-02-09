/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;


import java.util.ArrayList;

/**
 *
 * @author pb948
 */
public class TesteCartaoWeb {
    public static void main(String[] args) {
       DiaDosNamorados p1 = new DiaDosNamorados("Giulia");
       Natal p2 = new Natal("Juriscleide");
       Aniversario p3 = new Aniversario("Carlos");
       
        ArrayList<CartaoWeb> teste = new ArrayList<>();
        teste.add(p1);
        teste.add(p2);
        teste.add(p3);
        
        for(int i = 0; i < teste.size(); i++ ){
            System.out.println(teste.get(i).retornarMensagem("Pedro"));
        }
    }
}
