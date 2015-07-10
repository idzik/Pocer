package poc.app;

import poc.card.Waist;
import poc.player.Player;

public class App {

	public static void main(String[] args) {
		Waist talia = new Waist();
		Player p1 = new Player();
		Player p2 = new Player();
		
		p1.addCard(talia);
		p2.addCard(talia);
		
		System.out.println("Karty p1 " + p1.getCardList());
		System.out.println("Karty p2 " + p2.getCardList());

	}

}
