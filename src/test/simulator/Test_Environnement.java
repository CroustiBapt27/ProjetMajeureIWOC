package test.simulator;

import static org.junit.Assert.*;

import org.junit.Test;

import simulator.model.*;

public class Test_Environnement {

	@Test
	public void Contructeur1() {
		Environnement env = new Environnement(5,5,0.5);
		assertTrue(true);
	}
	
	public void Contructeur2() {
		Environnement env = new Environnement(5,5);
		assertTrue(true);
	}
	
	

}
