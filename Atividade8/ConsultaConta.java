/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg9;

/**
 *
 * @author pb948
 */
public class ConsultaConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta(10000, "poupanca");
            c1.depositar(100);
            c1.sacar(50);
            c1.consultarSaldo("poupanca");
            
    }
    
    
    
}
