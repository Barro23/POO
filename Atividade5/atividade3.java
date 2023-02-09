package aula7;
import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]a = new int[10];
        int[]b = new int[10];
        int[]c = new int[10];
        
        System.out.println("digite os valores de a");
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        a[3] = in.nextInt();
        a[4] = in.nextInt();
        a[5] = in.nextInt();
        a[6] = in.nextInt();
        a[7] = in.nextInt();
        a[8] = in.nextInt();
        a[9] = in.nextInt();

        System.out.println("digite os valores de b");
        b[0] = in.nextInt();
        b[1] = in.nextInt();
        b[2] = in.nextInt();
        b[3] = in.nextInt();
        b[4] = in.nextInt();
        b[5] = in.nextInt();
        b[6] = in.nextInt();
        b[7] = in.nextInt();
        b[8] = in.nextInt();
        b[9] = in.nextInt();

        
        System.out.println("valores do array");
        for(int i=0; i<a.length; i++){
            System.out.println("valor da posição " + (i+1) + " na tabela a eh " + a[i] );
        }
        for(int i=0; i<b.length; i++){
            System.out.println("valor da posição " + (i+1) + " na tabela b eh " + b[i] );
        }
        System.out.println("valores de c");
        for(int i=0; i<c.length; i++){
            c[i] = a[i] * b[i];
            System.out.println("valor da posição " + (i+1) + " na tabela c eh " + c[i] );
        }
    }
}