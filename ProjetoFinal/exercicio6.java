package projeto.pkg1;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int aluno = in.nextInt();
        double cont = 0;
     
        for(int i = 0; i < aluno; i++){
            for(int a = 0; a < 3; a++){
                String nota = in.next();
                cont+= Double.parseDouble(nota);
            }
            System.out.println(String.format("%.2f", cont));
            cont= 0;
        }
        
       }
}
