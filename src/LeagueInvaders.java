import javax.swing.JFrame;

public class LeagueInvaders {
JFrame myFrame;
final int width= 500;
final int height= 800;
GamePanel mygamepanel;
	public LeagueInvaders() {
		mygamepanel = new GamePanel();
		myFrame = new JFrame();
myFrame.setSize(width, height);
	}
	
private void setup() {
myFrame.add(mygamepanel);
myFrame.setVisible(true);
myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
mygamepanel.startGame();

myFrame.addKeyListener(mygamepanel);
	}

public static void main(String[] args) {
	
LeagueInvaders object = new LeagueInvaders();
	object.setup();
}	

}
