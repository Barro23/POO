/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;
/**
 *
 * @author pb948
 */
public class DiaDosNamorados extends CartaoWeb {

    public DiaDosNamorados(String destinatario) {
        this.destinatario = destinatario;
    }
    
    @Override
    public String retornarMensagem(String remetente){
        return "Querida " + destinatario + ",\n" +
               "Feliz Dia dos Namorados!\n" +
               "Espero que esse tenha sido o único cartão do dia dos namorados que\n" +
               "tenha ganhado nessa data!\n" +
               "De todo meu coração, " + remetente;
    }
    
   
}
