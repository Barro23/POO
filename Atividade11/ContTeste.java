/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contteste;

/**
 *
 * @author 20211070130148
 */
public class ContTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuentes p1 = new PessoaFisica(2100, 700,"alan");
            System.out.println(p1.toString());
        Contribuentes p2 = new PessoaFisica(3700, 2000,"ana");
            System.out.println(p2.toString());
        Contribuentes p3 = new PessoaFisica(1300, 850,"luan");
            System.out.println(p3.toString());
        
        Contribuentes p4 = new PessoaJuridica(1500, 800,"maria");
            System.out.println(p4.toString());
        Contribuentes p5 = new PessoaJuridica(1100, 700,"alana");
            System.out.println(p5.toString());
        Contribuentes p6 = new PessoaJuridica(2100, 900,"luiz");
            System.out.println(p6.toString());    
    }
    
}
