/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Score;

/**
 *
 * @author Mike
 */
public class Germany implements Language,Language2{
    
    public String getPuntos(int points){
        String[] words={"LIEBE","FÜNZEHN","DREBIG","VIERZING"};
        return words[points];
    }
    public String getDeuce(){
        return "ZIEHEN";
    }
    public String getAll(){
        return "ALLE";
    }
    public String getAdvantage(){
        return "SPIELER BEWEGT SICH ";
    }
    public String getWin(){
        return "SPIELER GEWINNT ";
    }

    
}
