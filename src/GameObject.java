import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
GameObject(){}

	void update(){
		
		x=55;
		y=555;
		
		
	}
	
	void draw(Graphics g){
		g.fillRect(x, y, 100, 100);
	}
	
	
	
	
	
	
}
