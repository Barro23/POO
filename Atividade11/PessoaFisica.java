/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contteste;

/**
 *
 * @author 20211070130148
 */
public class PessoaFisica extends Contribuentes{
    double renda;
    double imposto;
    double salario;
    double salarioFinal;

    public PessoaFisica(double renda, double salario, String nome) {
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
      if(renda <= 1400){
          imposto = 0;
          salarioFinal = salario - imposto;
      }else if(renda > 1400&& renda <= 2100){
          imposto = 100;
          salarioFinal = salario - imposto;
      }else if(renda > 2100 && renda <= 2800){
          imposto = 270;
          salarioFinal = salario - imposto;
      }else if(renda > 2800 && renda <= 3600){
          imposto = 500;
          salarioFinal = salario - imposto;
      }else if(renda >  3600){
          imposto = 700;
          salarioFinal = salario - imposto;
      }
      return salarioFinal;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "salarioFinal " + nome + " = " + calcularImposto() + '}';
    }
    
    
}
