package aula8;

/**
 *
 * @author pb948
 */
public class Aluno {
    String nome;
    int matricula;
    String curso;
    String Disciplina1;
    String Disciplina2;
    String Disciplina3;
    double nota1;
    double nota2;
    double nota3;
    String aprovadoOuReprovado;
    
    
   void aprovadoOuReprovado(){
       double media = (nota1 + nota2 + nota3) / 3;
       if(media >= 7){
           System.out.println("aprovado");
       }else{
           System.out.println("reprovado");
       }
   }
}
