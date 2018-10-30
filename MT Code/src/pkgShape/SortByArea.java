package pkgShape;

import java.util.Comparator;

public class SortByArea implements Comparator<Cuboid>{
	
	SortByArea() {

	}
	@Override
	public int compare(Cuboid object1, Cuboid  object2) {
		if (object1.area() > object2.area()) {
			return 1;
		}
		else if (object1.area() < object1.area()) {
			return 1;
	}
		return 0;
}
}
