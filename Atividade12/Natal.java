/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author pb948
 */
public class Natal extends CartaoWeb{

    public Natal(String destinatario) {
        this.destinatario = destinatario;
    }
    @Override
    public String retornarMensagem(String remetente){
        return "Querida " + destinatario + ",\n" +
               "Feliz Natal!\n" +
               "Espero que esteja bem\n" +
               "tenha um otimo natal!\n" +
               "De todo meu coração, " + remetente;
    }
    
    
}

