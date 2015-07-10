package enumCard;

import java.util.HashMap;
import java.util.Map;

public enum ColorEnum {

	Czerwien(0), Dzwonek(1), Wino(2), Zoladz(3);
	
	private int id;
	
	private ColorEnum(int id){
		this.id = id;
	}
	
	private static Map<Integer, ColorEnum> colorMapEnum = new HashMap<Integer, ColorEnum>();
	
	static{
		for(ColorEnum col : values()){
			colorMapEnum.put(col.id, col);
		}
	}
	
	public static ColorEnum getById(int id){
	
		return colorMapEnum.get(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static Map<Integer, ColorEnum> getColorMapEnum() {
		return colorMapEnum;
	}

	public static void setColorMapEnum(Map<Integer, ColorEnum> colorMapEnum) {
		ColorEnum.colorMapEnum = colorMapEnum;
	}
}
