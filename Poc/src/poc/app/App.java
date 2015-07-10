package poc.app;

import java.util.Random;

import poc.card.Waist;
import poc.property.Property;

public class App {

	public static void main(String[] args) {
		Random rd = new Random();
		Waist talia = new Waist();
		for(int i = 0 ; i<5 ; i++){
			int rand = rd.nextInt(Property.valueWaist);
			System.out.println("Liczba losowa " + rand + " "+talia.getWaist().get(rand));
		}
	}

}
