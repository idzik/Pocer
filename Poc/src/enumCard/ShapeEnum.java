package enumCard;

import java.util.HashMap;
import java.util.Map;

public enum ShapeEnum {

	C_2(0), C_3(1), C_4(2), C_5(3), C_6(4), C_7(5), C_8(6), C_9(7), C_10(8), Walet(9), Dama(10), Krol(11), As(12);
	
	private int id;
	
	private ShapeEnum(int id){
		this.id = id;
	}
	
	private static Map<Integer, ShapeEnum> idShapeMap = new HashMap<Integer, ShapeEnum>();
	
	static{
		for(ShapeEnum sh : values()){
			idShapeMap.put(sh.id, sh);
		}
	}

	public static ShapeEnum getById(int id){
		return idShapeMap.get(id);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static Map<Integer, ShapeEnum> getIdShapeMap() {
		return idShapeMap;
	}

	public static void setIdShapeMap(Map<Integer, ShapeEnum> idShapeMap) {
		ShapeEnum.idShapeMap = idShapeMap;
	}
}
