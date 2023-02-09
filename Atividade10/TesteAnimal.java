/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaanimal;

/**
 *
 * @author pb948
 */
public class TesteAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal tub  = new Animal("Tubarao","300 cm", "0", "cinzenta", "mar", "1.5 m/s");
        Peixe peixe = new Peixe("Barbatanas e cauda");
            System.out.println(tub);
            System.out.println(" caracteristicas: " + peixe.caracteristicas);
          
        System.out.println("");    
         
        Animal urso  = new Animal("urso-do-canada","180 cm", "4", "vermelho", "terra", "0.5 m/s");
        Mamifero mamifero = new Mamifero("Barbatanas e cauda");
            System.out.println(urso);
            System.out.println(" Alimento: " + mamifero.alimento);
    }
    
}
