package poc.card;

import java.util.ArrayList;

import enumCard.ColorEnum;
import enumCard.ShapeEnum;

public class Waist {
	private ArrayList<Card> waist = new ArrayList<Card>();
	
	public Waist(){
		for(int i = 0 ; i< ColorEnum.values().length ; i++){
			for(int j = 0 ; j < ShapeEnum.values().length ; j++){
				Card card = new Card(ColorEnum.getById(i).name(), ShapeEnum.getById(j).name());
				waist.add(card);
			}
		}
	}

	public ArrayList<Card> getWaist() {
		return waist;
	}

	public void setWaist(ArrayList<Card>  waist) {
		this.waist = waist;
	} 
	
	
}
