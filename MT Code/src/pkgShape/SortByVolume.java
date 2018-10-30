package pkgShape;

import java.util.Comparator;

public class SortByVolume implements Comparator<Cuboid>{
	
	SortByVolume() {

	}
	@Override
	public int compare(Cuboid object1, Cuboid  object2) {
		if (object1.volume() > object2.volume()) {
			return 1;
		}
		else if (object1.volume() < object1.volume()) {
			return -1;
	}
		return 0;
}
}

