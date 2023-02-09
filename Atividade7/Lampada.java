package aula8;

public class Lampada {
    String tipoLampada;
    String Voltagem;
    String ligada = "ligada";
    String desligado = "desligada";
    
    String lampLigada()
    {
        return "lampada " + ligada;
    }
    String lampDesligada()
    {
        return "lampada " + desligado;
    }
}

