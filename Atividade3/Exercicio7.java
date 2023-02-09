package exerciciosaula4;
import java.util.Scanner;

public class Exercicio7 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("digite qual modeno o senhor deseja");
        String n1 = in.nextLine();

        switch(n1){
            case "hatch":
                System.out.println("“Compra efetuada com sucesso”");
                break;
            case "sedans":
                System.out.println("“Tem certeza que não prefere este modelo?");
                break;
            case "motocicletas":
                System.out.println("Tem certeza que não prefere este modelo?");
                break;
                
            case "caminhonetes":
                System.out.println("Tem certeza que não prefere este modelo?");
                break;
                        
            default : 
                System.out.println("Não trabalhamos com este tipo de automóvel aqui");
        }

    }
    
}
