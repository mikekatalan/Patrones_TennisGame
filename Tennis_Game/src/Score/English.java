/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Score;

/**
 *
 * @author Mike
 */
public class English implements Language,Language2 {
    
    public String getPuntos(int points){
        String[] words={"LOVE","FIFTEEN","THIRTY","FORTY"};
        return words[points];
    }
    public String getDeuce(){
        return "DEUCE";
    }
    public String getAll(){
        return "ALL";
    }
    public String getAdvantage(){
        return "ADVANTAGE PLAYER ";
    }
    public String getWin(){
        return "WINS PLAYER ";
    }
}
