package pkgShape;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;


import org.junit.Rule;
import org.junit.rules.ExpectedException;

@SuppressWarnings("unused")
class CuboidTest {

	@Test
	public void constructorTest() {
		Cuboid c = new Cuboid(5,5,5);
		assertTrue(c instanceof Cuboid);
	}
	
	@Test
	public void settersTest() {
		Cuboid c = new Cuboid(5,5,5);
		c.setiDepth(15);
		c.setiLength(10);
		c.setiWidth(5);
		assertTrue((c.getiDepth()==15)&&(c.getiLength()==10)&&(c.getiWidth()==5));
	}
	
	@Test
	public void gettersTest() {
		Cuboid c = new Cuboid(15,10,5);
		assertTrue((c.getiDepth()==5)&&(c.getiLength()==10)&&(c.getiWidth()==15));
	}
	@Test
	public void areaTest() {
		Cuboid c = new Cuboid(5,5,5);
		assertTrue(c.area()==150);
	}

	
	@Test
	public void sortbyAreaTest() {
		Cuboid c1 = new Cuboid(1,1,1);
		Cuboid c2 = new Cuboid(5,5,5);
		Cuboid c3 = new Cuboid(10,10,10);
		ArrayList<Cuboid> cube = new ArrayList<Cuboid>();
		cube.add(c1);
		cube.add(c2);
		cube.add(c3);
		Collections.sort(cube, new SortByArea());
		Cuboid[] c = {c1, c2, c3};
		assertArrayEquals(c,cube.toArray());
	}
	
	@Test
	public void sortbyVolumeTest() {
		Cuboid c1 = new Cuboid(1,1,1);
		Cuboid c2 = new Cuboid(5,5,5);
		Cuboid c3 = new Cuboid(10,10,10);
		ArrayList<Cuboid> cube = new ArrayList<Cuboid>();
		cube.add(c1);
		cube.add(c2);
		cube.add(c3);
		Collections.sort(cube, new SortByVolume());
		Cuboid[] c = {c1, c2, c3};
		assertArrayEquals(c,cube.toArray());
	}

}
