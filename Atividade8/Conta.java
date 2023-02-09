package aula.pkg9;
import java.util.Scanner;

public class Conta {
    Scanner in = new Scanner(System.in);
    double saldo;
    double saldoFinal;
    String tipo = "corrente";
    
    public Conta(double valorInicial){
        this.saldo = valorInicial;
    }
    public Conta(double valorInicial, String tipo){
        this.saldo = valorInicial;
        this.tipo = tipo;
   }
    public boolean depositar(double valor){
        this.saldo = valor + saldo;
        if("corrente".equals(tipo)){
            if(valor > 1000){System.out.println("voce nao pode depositar valores acima de 1.000,00");}
        }else if("poupaca".equals(tipo)){
            return valor > 0;
        } 
        return true;
   }
    double sacar(double valor){
        if(valor > saldo){
            System.out.println("não é possivel fazer esse saque");
        }
        this.saldoFinal = saldo - valor;
        return valor;
    }
    void consultarSaldo(Conta tipoConta){
        System.out.println(saldoFinal);
    }

    void consultarSaldo(String corente) {
        System.out.println("saldo final da sua conta;");
        System.out.println(saldoFinal);
    }
}
