package aula8;
import java.util.Scanner;
/**
 *
 * @author pb948
 */
public class ContaCorrente {
    Scanner in = new Scanner(System.in);
    int numeroCont; 
    float saldo;
    String status;
    float limite;
    
    
    int saque(){
      System.out.println("quanto sacou?");
      int saque = in.nextInt();
      return saque;     
    }
    int deposito(){
      System.out.println("quanto depositou?");
      int deposito = in.nextInt();
      return deposito; 
    }
    float saldo(){
       return saldo; 
    }
    String cheque(){
       System.out.println("qual tipo de cheque?");
       String cheque = in.next();
       return cheque;
    }
}
