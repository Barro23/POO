/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author pb948
 */
public class contaCorrente {
    int numeroCont; 
    float saldo;
    String status;
    float limite;
    
    public static void main(String[] args) {
    
    contaCorrente contEspecial = new contaCorrente();
        contEspecial.numeroCont = 01;
        contEspecial.saldo = 100000;
        contEspecial.status = "Especial";
        contEspecial.limite = 10000000;
        
    contaCorrente contNaoEspecial = new contaCorrente();
        contNaoEspecial.numeroCont = 02;
        contNaoEspecial.saldo = 200000;
        contNaoEspecial.status = "Não Especial";
        contNaoEspecial.limite = 10000000;
    }
}
