/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author pb948
 */
public class Data {
    private int mes;
    private int dia;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getMes() {
        return this.mes;
    }

    public int getDia() {
        return this.dia;
    }

    public int getAno() {
        return this.ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void displayData(){
        System.out.println(dia + "/" + mes + "/" + ano );
    }
    
}
