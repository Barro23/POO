/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author pb948
 */
public class BuscaMaiorMenor {
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private int maior;
    private int menor;

    public BuscaMaiorMenor(int n1, int n2, int n3, int n4, int n5) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public int getN5() {
        return n5;
    }

    public void setN5(int n5) {
        this.n5 = n5;
    }

    public void setMaior() {
        maior = n1;
        if(n1 > maior){
           maior = n1;
        }if(n2 > maior){
            maior = n2;
        }if(n3 > maior){
            maior = n3;
        }if(n4 > maior){
            maior = n4;
        }if(n5 > maior){
            maior = n5;
        
        }
        
    }

    public void setMenor() {
        menor = n1;
        if(n1 < menor){
           menor = n1;
        }if(n2 < menor){
           menor = n2;
        }if(n3 < menor){
           menor = n3;
        }if(n4 < menor){
           menor = n4;
        }if(n5 < menor){
           menor = n5;
        }
        
       
    }

    public int getMaior() {
        return maior;
    }

    public int getMenor() {
        return menor;
    }
    

    @Override
    public String toString() {
        return "BuscaMaiorMenor{" + "maior valor = " + this.maior + ", menor valor = " + this.menor + '}';
    }
    
    
    
    
    
    
    
}
