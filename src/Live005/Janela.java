package Live005;

import javax.swing.JFrame;

public class Janela{
	
	public static void main(String[] args) {
		JFrame janela = new JFrame("Personagem 2D");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(1366,730);
		
		
		Canvas canvas = new Canvas();
		janela.add(canvas);
		
		janela.setVisible(true);
	}
}
