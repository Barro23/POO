/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author pb948
 */
public class BuscarMaiorMenor {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int maior;
    private int menor;
    
    public BuscarMaiorMenor(int num1, int num2, int num3, int num4, int num5){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    public int getMaior() {
        return this.maior;
    }

    public int getMenor() {
        return this.menor;
    }

    public void setMaior() {
        maior = num1;
        if(num1 > maior){
           maior = num1;
        }if(num2 > maior){
            maior = num2;
        }if(num3 > maior){
            maior = num3;
        }if(num4 > maior){
            maior = num4;
        }if(num5 > maior){
            maior = num5;
        }
    }

    public void setMenor() {
        menor = num1;
        if(num1 < menor){
           menor = num1;
        }if(num2 < menor){
           menor = num2;
        }if(num3 < menor){
           menor = num3;
        }if(num4 < menor){
           menor = num4;
        }if(num5 < menor){
           menor = num5;
        }
    }
    
}
