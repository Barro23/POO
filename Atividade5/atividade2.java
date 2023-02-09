package aula7;
import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]a = new int[8];
        int[]b = new int[8];
        
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        a[3] = in.nextInt();
        a[4] = in.nextInt();
        a[5] = in.nextInt();
        a[6] = in.nextInt();
        a[7] = in.nextInt();
        

        
        System.out.println("valores do array");
        for(int i=0; i<a.length; i++){
            System.out.println("valor da posição " + (i+1) + " na tabela a eh " + a[i] );
        }
        for(int i=0; i<b.length; i++){
            b[i] = a[i] * 2;
            System.out.println("valor da posição " + (i+1) + " na tabela b eh " + b[i] );
        }
    }
}
 
