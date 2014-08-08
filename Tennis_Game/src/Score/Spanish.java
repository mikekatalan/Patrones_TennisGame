/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Score;

/**
 *
 * @author Mike
 */
public class Spanish implements Language,Language2 {
    public String getPuntos(int puntos){
        
        String palabras[]={"CERO","QUINCE","TREINTA","CUARENTA"};
        return palabras[puntos];
    }
    public String getDeuce(){
        return "EMPATE";
    }
    public String getAll(){
        return "IGUALES";
    }
    public String getAdvantage(){
        return "VENTAJA JUGADOR ";
    }
    public String getWin(){
        return "GANA JUGADOR ";
    }
}
