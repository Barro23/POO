/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contteste;

/**
 *
 * @author 20211070130148
 */
public class PessoaJuridica extends Contribuentes{
    double renda;
    double imposto;
    double salario;
    double salarioFinal;

    public PessoaJuridica(double renda, double salario, String nome) {
        super(nome);
        this.renda = renda;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

   

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    
    @Override
    public double calcularImposto(){
        imposto = (10*renda)/100;
        return salarioFinal = salario - imposto;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "salarioFinal " + nome + " = " + calcularImposto() + '}';
    }
    
}
