package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import traccia.Tris;




public class TrisBasicTest {
	
	private static Tris tris;
	
	@BeforeClass
	public static void initTest() {
		tris=new Tris(); 
	}
	
	@Before
	public void resetTest() {
		tris.reset();
	}
	
	@Test
	public void winXTest() {
		tris.play(0,0);
		tris.play(1,1);
		tris.play(1,0);
		tris.play(1,2);
		tris.play(2,0);
		//tris.print();
		assertEquals(1, tris.getWinner());
	}
	
	@Test
	public void winOTest() {
		tris.play(1,1);
		tris.play(0,0);
		
		tris.play(2,2);
		tris.play(1,0);
		
		tris.play(0,2);
		tris.play(2,0);
		//tris.print();
		assertEquals(2, tris.getWinner());
	}
	
	@Test
	public void pareggioTest() {
		tris.play(0,0);
		tris.play(1,0);
		tris.play(2,0);
		
		tris.play(0,2);
		tris.play(0,1);
		tris.play(1,1);
		tris.play(1,2);
		
		tris.play(2,1);
		tris.play(2,2);
		//tris.print();
		assertEquals(3, tris.getWinner());
	}
	
	@Test
	public void FalseAfter3Test() {
		tris.play(0,0);
		tris.play(1,2);
		//tris.print();
		
		assertEquals(false, tris.play(2,0));

	}
}
