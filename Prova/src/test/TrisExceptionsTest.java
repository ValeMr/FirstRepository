package test;



import org.junit.BeforeClass;
import org.junit.Test;

import traccia.InvalidPlayException;
import traccia.Tris;

public class TrisExceptionsTest {
	
	private static Tris tris;
	
	@BeforeClass
	public static void initTest() {
		tris=new Tris(); 
	}
	
	@Test(expected=InvalidPlayException.class)
	public void ExceptionWinTest() {
		tris.play(0,0);
		tris.play(1,1);
		tris.play(1,0);
		tris.play(1,2);
		tris.play(2,0);
		tris.play(0,1);
		//tris.print();
	}
	
	@Test(expected=InvalidPlayException.class)
	public void ExceptionPositionTest() {
		tris.play(0,0);
		tris.play(0,0);
		
		//tris.print();
	}
	

}
