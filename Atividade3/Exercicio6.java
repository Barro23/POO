package exerciciosaula4;
import java.util.Scanner;

public class Exercicio6 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Responda com s ou n");
        System.out.println("Telefonou para a vítima?");
        String n1 = in.nextLine();
        System.out.println("Esteve no local do crime?" );
        String n2 = in.nextLine();
        System.out.println("Mora perto da vítima? ");
        String n3 = in.nextLine();        
        System.out.println("Devia para a vítima?" );
        String n4 = in.nextLine();
        System.out.println("Já trabalhou com a vítima?" );
        String n5 = in.nextLine(); 
        
        int contador = 0;
        if(n1.equalsIgnoreCase("s")){
            contador = contador + 1 ;
            
        }if(n2.equalsIgnoreCase("s")){
            contador = contador + 1 ;
        }if(n3.equalsIgnoreCase("s")){
            contador = contador + 1;
        }if(n4.equalsIgnoreCase("s")){
            contador = contador + 1 ;
        }if(n5.equalsIgnoreCase("s")){
            contador = contador + 1 ;
        }
        
        
        
        if(contador == 5){
            System.out.println("Assassino" );
            
        }else if (contador == 2){
            System.out.println("Suspeito" );
            
        }else if (contador == 3 || contador == 4){
            System.out.println("Cúmplice" );
            
        }else{
            System.out.println("Não tem nada a ver" );
        }
    }
    
}
