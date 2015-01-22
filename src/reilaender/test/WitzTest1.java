package reilaender.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import witze.*;

public class WitzTest1 {
	private Witze w;
		
	@Before
	public void setUp() throws Exception {
		w = new WitzeSammlung("req\\witze.txt");
	}
	
	@Test
	public void test() {
		String expected = "Ein Ehemann tritt auf eine dieser Jahrmarktswaagen, die einem beim Wiegen das Schicksal voraus-"+  
						  "sagen, und wirft eine M�nze ein. �H�r mal�, sagt er zu seiner Frau und zeigt ihr die kleine, wei�e"+
						  "Karte. �Hier steht, dass ich energisch, intelligent, fantasievoll und �berhaupt ein toller Mensch bin.�"+   
						  "�Ja�, nickt darauf seine Frau, �und dein Gewicht stimmt auch nicht.�";
		String actual = w.readFirstJoke();
		assertEquals(expected, actual);
	}
}