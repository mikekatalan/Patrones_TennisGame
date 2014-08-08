/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Score;

/**
 *
 * @author Mike
 */
public class Francais implements Language,Language2 {
    
    public String getPuntos(int points){
        String[] words={"ZERO","QUINZE","TRENTE","QUARANTE"};
        return words[points];
    }
    public String getDeuce(){
        return "ATTACHER";
    }
    public String getAll(){
        return "À";
    }
    public String getAdvantage(){
        return "AVANTAGE JOUEUR ";
    }
    public String getWin(){
        return "GAGNE JOUEUR ";
    }
}
