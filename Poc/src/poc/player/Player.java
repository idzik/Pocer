package poc.player;

import java.util.ArrayList;
import java.util.Random;

import poc.card.Card;
import poc.card.Waist;

public class Player {

	private ArrayList<Card> cardList = new ArrayList<Card>();
	
	
	public void addCard(Waist talia){
		Random rd = new Random();
		for(int i = 0 ; i<5 ; i++){
			
			int rand = rd.nextInt(talia.getWaist().size());
			cardList.add(talia.getWaist().get(rand));
			talia.getWaist().remove(rand);		
		}
	}

	public ArrayList<Card> getCardList() {
		return cardList;
	}

	public void setCardList(ArrayList<Card> cardList) {
		this.cardList = cardList;
	}
	
	
	
	
}
