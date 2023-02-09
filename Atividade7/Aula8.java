
package aula8;
import java.util.Scanner;
/**
 *
 * @author pb948
 */
public class Aula8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Lampada  lampada = new Lampada();
        System.out.println(lampada.lampLigada());
        System.out.println(lampada.lampDesligada());
    
    ContaCorrente contEspecial = new ContaCorrente();
        contEspecial.numeroCont = 01;
        contEspecial.saldo = 100000;
        contEspecial.status = "Especial";
        contEspecial.limite = 10000000;
        System.out.println("saque = " + contEspecial.saque());
        System.out.println("depositou = " + contEspecial.deposito());
        System.out.println("saldo da conta = " + contEspecial.saldo());
        System.out.println("o cheque é " + contEspecial.cheque());
        
    ContaCorrente contNaoEspecial = new ContaCorrente();
        contNaoEspecial.numeroCont = 02;
        contNaoEspecial.saldo = 200000;
        contNaoEspecial.status = "Não Especial";
        contNaoEspecial.limite = 10000000;
        System.out.println("saque = " + contNaoEspecial.saque());
        System.out.println("depositou = " + contNaoEspecial.deposito());
        System.out.println("saldo da conta = " + contNaoEspecial.saldo());
        System.out.println("o cheque é " + contNaoEspecial.cheque());
    
    Aluno aluno = new Aluno();
        System.out.println("nome do aluno?");
        aluno.nome = in.next();
        System.out.println("matricula do aluno?");
        aluno.matricula = in.nextInt();
        System.out.println("Curso do aluno?");
        aluno.curso = in.next();
        System.out.println("Disciplinas cursadas do aluno?");
        aluno.Disciplina1 = in.next();
        aluno.Disciplina2 = in.next();
        aluno.Disciplina3 = in.next();
        System.out.println("respectivas notas dessas disciplinas do aluno?");
        aluno.nota1 = in.nextDouble();
        aluno.nota2 = in.nextDouble();
        aluno.nota3 = in.nextDouble();
        
        System.out.println("notas do aluno " + aluno.nome + "são as seguintes: " + aluno.Disciplina1 + "=" + aluno.nota1 +  ";"+ aluno.Disciplina2 + "=" + aluno.nota2 +  ";"+ aluno.Disciplina3 + "=" + aluno.nota3);
        aluno.aprovadoOuReprovado();
        
        
    
    } 
 }
