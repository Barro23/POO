/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaanimal;

/**
 *
 * @author pb948
 */
public class Animal {
    protected String nome;
    protected String comprimento;
    protected String nunPatas;
    protected String cor;
    protected String ambiente;
    protected String velocidade;

    public Animal(String nome, String comprimento, String nunPatas, String cor, String ambiente, String velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.nunPatas = nunPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getNunPatas() {
        return nunPatas;
    }

    public void setNunPatas(String nunPatas) {
        this.nunPatas = nunPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return " Animal: " + nome + 
               "\n comprimento: " + comprimento + 
               "\n nunPatas: " + nunPatas + 
               "\n cor: " + cor + 
               "\n ambiente: " + ambiente + 
               "\n velocidade: " + velocidade;
    }
    
    
}
