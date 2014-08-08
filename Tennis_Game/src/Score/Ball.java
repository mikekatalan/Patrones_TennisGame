package Score;
/**
 *
 * @author Mike
 */
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {
	private static final int DIAMETER = 29;
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	private Game game;

	public Ball(Game game) {
		this.game= game;
	}


	void move() {
            
		if (x + xa < 0){
                 xa=1;
                 
                }
		
                if (x + xa > game.getWidth() - DIAMETER){
                xa = -1;
                }
                
                //golpe en eje Y Positivo//
		if (y + ya < 0){
			ya = 1;
                    
                    //System.out.println("jjaja");
                   Main.getIntance().plusPlayer1();
           
                }
                
                 //golpe en eje Y Negativo
		if (y + ya > game.getHeight() - DIAMETER){
                        ya = -1;
                   Main.getIntance().plusPlayer2();
                }
                //para que no rebote abajo//ya = -1;
                
		if (collision()){
			ya = -1;
			y = game.racquet1.getTopY() - DIAMETER;
		}
                
                if (collision2()){
			ya = 1;
			y = game.racquet2.getTopY() + DIAMETER;
		}
               
               
                //inician el mov de la pelota en X y Y
		x = x + xa;
		y = y + ya;
	}

	private boolean collision() {
		return game.racquet1.getBounds().intersects(getBounds());
	}
        
        private boolean collision2() {
		return game.racquet2.getBounds().intersects(getBounds());
	}

	public void paint(Graphics2D g) {
		g.fillOval(x, y, DIAMETER, DIAMETER);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, DIAMETER, DIAMETER);
	}
     
}