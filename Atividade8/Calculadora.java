
package aula9;


public class Calculadora {
    int num1;
    int num2;
    
     public double soma(double num1, double num2){
        double soma = num1 + num2;
        return soma;
    }
    public double subtracao(double num1, double num2){
        double sub = num1 - num2;
        return sub;
    }
    public double mutiplicacao(double num1, double num2){
        double mul = num1 * num2;
        return mul;
    }
    public double divisao(double num1, double num2){
        double div = num1 / num2;
        return div;
    }
    public double resto(double num1, double num2){
        double resto = num1 % num2;
        return resto;
    }


    public void menu(){
        System.out.println("MENU");
        System.out.println("[1] - soma");
        System.out.println("[2] - subtração");
        System.out.println("[3] - multiplicação");
        System.out.println("[4] - divisão");
        System.out.println("[5] - resto da divisão");
        System.out.println("[0] - sair");
        
    }   
        
}

