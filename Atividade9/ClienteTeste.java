/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author pb948
 */
public class ClienteTeste {
    public static void main(String[] args){
        Cliente cl = new Cliente(21);
            System.out.println("nome: " + cl.getNome());
            cl.setNome("Gustavo");
            System.out.println("nome: " + cl.getNome());
        Cliente cl1 = new Cliente(30);
            System.out.println("nome: " + cl1.getNome());
            cl1.setNome("Gurtavo");
            System.out.println("nome: " + cl1.getNome());
    }
}
