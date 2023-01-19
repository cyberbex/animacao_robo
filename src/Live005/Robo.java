package Live005;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Robo {
	
	private BufferedImage correndo[];
	private int indiceImagemAtual;
	private int timer;
	
	public Robo() {
		
		indiceImagemAtual = 0;
		timer = 0;
		correndo = new BufferedImage[8];
		
		for(int i=0; i<8; i++) {
			try {
				System.out.println("carregando a imagem ("+(i+1)+").png");
				correndo[i] = ImageIO.read(new File("imagensRobo/Run ("+(i+1)+ ").png"));
			} catch (IOException e) {
				System.out.println("Nao foi possivel carregar a imagem");
				e.printStackTrace();
			}
		}
	}
	
	public void atualizar() {
		
		timer++;
		
		if(timer >= 4) {
			indiceImagemAtual++;
			if(indiceImagemAtual == 8) {
				indiceImagemAtual = 0;
			}
			timer=0;
		}
		
	}
	public void pintar(Graphics2D g) {
		g.drawImage(correndo[indiceImagemAtual], 50,50,null);
	}
}
