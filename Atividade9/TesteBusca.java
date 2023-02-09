/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author pb948
 */
public class TesteBusca {
    public static void main(String[] args){
        BuscarMaiorMenor bmm = new BuscarMaiorMenor(1, 2, 2, 3, 5);
           bmm.setMaior();
           bmm.setMenor();
           System.out.println(bmm.getMaior());
           System.out.println(bmm.getMenor());
    }
}
