import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{
int speed;
static boolean up;
static boolean down;
static boolean right;
static boolean left;
	Rocketship (int x, int y, int width, int height) {
		super(x, y, width, height);
//		this.x = x;
//		this.y= y;
//		this.width=width;
//		this.height=height;
		speed = 5;
		
	}
	
	void update()
	{
		
		super.update();
		
		if(up){
			y-=speed;
			
		}
		if(down){
			y+=speed;
			
		}
		if(left){
			x-=speed;
			
		}
		if(right){
			x+=speed;
			
		}
		
		if(y>= 730){
			y=730;	
		}
		if(y<= 0){
			y=0;	
		}
		if(x>= 450){
			x=450;	
		}
		if(x<= 0){
			x=0;	
		}
	}
	
	void draw(Graphics g){
		
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
		
	}
	
}
