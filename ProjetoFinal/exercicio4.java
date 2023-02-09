package projeto.pkg1;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]n = new int[10];
  
        
        n[0] = in.nextInt();
        if(n[0]<=50){
            n[1] = n[0] + n[0];
            n[2] = n[1] + n[1];
            n[3] = n[2] + n[2];
            n[4] = n[3] + n[3];
            n[5] = n[4] + n[4];
            n[6] = n[5] + n[5];
            n[7] = n[6] + n[6];
            n[8] = n[7] + n[7];
            n[9] = n[8] + n[8];
            System.out.println("N[0] = " + n[0]);
        System.out.println("N[1] = " + n[1]);
        System.out.println("N[2] = " + n[2]);
        System.out.println("N[3] = " + n[3]);
        System.out.println("N[4] = " + n[4]);
        System.out.println("N[5] = " + n[5]);
        System.out.println("N[6] = " + n[6]);
        System.out.println("N[7] = " + n[7]);
        System.out.println("N[8] = " + n[8]);
        System.out.println("N[9] = " + n[9]);
        }
        
    
        
    }

}