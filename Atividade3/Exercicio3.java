package exerciciosaula4;
import java.util.Scanner;

public class Exercicio3 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("digite a primeira nota");
        double n1 = in.nextDouble();
        System.out.println("digite a segunda nota");
        double n2 = in.nextDouble();
        
        double media = (n1 + n2)/ 2;
        
        if(media >= 7 && media < 10){
            System.out.println("aprovado");
        } else if (media < 7){
            System.out.println("reprovado");
        } else if(media == 10){
            System.out.println("Aprovado com Distinção");
    }

    }
    
}
