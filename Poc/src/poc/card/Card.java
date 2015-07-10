package poc.card;


public class Card {

	private String color;
	private String shape;
	
	
	public Card(String color, String shape) {
		this.color = color;
		this.shape = shape;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	@Override
	public String toString() {
		return "Card [color=" + color + ", shape=" + shape + "]";
	}
	

	
}

