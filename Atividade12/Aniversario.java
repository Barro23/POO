/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;
/**
 *
 * @author pb948
 */
public class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    @Override
    public String retornarMensagem(String remetente){
        return destinatario + ",\n" +
               "Feliz aniversario!\n" +
               "Espero que seja muito felz na sua vida\n" +
               "tenho muita consderação por ti!\n" +
               "De todo meu coração, " + remetente;
    }
    
}

