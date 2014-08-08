/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Score;

/**
 *
 * @author Mike
 */
public class LanguageF implements Language,Language2 {
    public String getPuntos(int points){
        
        String[] words={"CEFEROFO","QUINFICEFE","TREFEINFITAFA","CUFUAFARENFETAFA"};
        return words[points];
    }
    public String getDeuce(){
        return "EMFEPAFATEFE";
    }
    public String getAll(){
        return "IFIGUAFALESFE";
    }
    public String getAdvantage(){
        return "VENFETAFAJAFA JUFUGAFADORFO ";
    }
    public String getWin(){
        return "GAFANAFA JUFUGAFADORFO ";
    }
}
