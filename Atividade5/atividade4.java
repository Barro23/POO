package aula7;
import java.util.Scanner;

public class atividade4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]a = new int[10];
        int maior=0;
        int menor=9999;
        int contador;
        int pos_maior = 0;
        int pos_menor = 0;
        
        System.out.println("digite os valores das idades");
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

   
        System.out.println("valores do array");
  for( contador=0; contador<10; contador++ )
    {
        if( a[contador] >= maior )
        {
            maior = a[contador];
            pos_maior = contador+1;
        }
        if( a[contador] <= menor )
        {
            menor = a[contador];
            pos_menor = contador+1;
        }
    }
    System.out.println("maior idade e respectivamente a posicao; " + maior + "," + pos_maior);
    System.out.println("menor idade e respectivamente a posicao; " + menor + "," + pos_menor);

}
}


