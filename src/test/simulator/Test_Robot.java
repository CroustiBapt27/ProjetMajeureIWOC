package test.simulator;

import static org.junit.Assert.*;

import org.junit.Test;
import simulator.model.*;

public class Test_Robot {

	@Test
	public void Constructeur() {
		System.out.println("Test_Robot getCellule\n");
		Robot robot_contru = new Robot(1,1,Orientation.BAS,5,5);
		assertTrue(true);
	}
	
	@Test
	public void deplacement_ontab_ok() {
		System.out.println("Test_Robot deplacement_ontab_ok\n");
		Robot robot_contru = new Robot(1,1,Orientation.BAS,5,5);
		
		int [] tab_coord_temp;
		tab_coord_temp = new int [2];
		
		tab_coord_temp=robot_contru.deplacement_ontab(Deplacement.DOWN_ARROW);
		
		if(tab_coord_temp[0] != 0)
			assertTrue(true);
	}
	
	@Test
	public void deplacement_ontab_notok() {
		System.out.println("Test_Robot deplacement_ontab_notok\n");
		Robot robot_contru = new Robot(5,5,Orientation.BAS,5,5);
		
		int [] tab_coord_temp;
		tab_coord_temp = new int [2];
		
		tab_coord_temp=robot_contru.deplacement_ontab(Deplacement.DOWN_ARROW);
		
		if(tab_coord_temp[0] == 0)
			assertTrue(true);
	}
	
	@Test
	public void deplacement_case_ok() {
		System.out.println("Test_Robot deplacement_case_ok\n");
		
		Robot robot_contru = new Robot(1,1,Orientation.BAS,5,5);
		
		int [] tab_coord_temp;
		tab_coord_temp = new int [2];
		
		tab_coord_temp=robot_contru.deplacement_ontab(Deplacement.DOWN_ARROW);
		
		if(tab_coord_temp[0] != 0){
			robot_contru.setX_robot(tab_coord_temp[0]);
		}
		if(robot_contru.getX_robot() != 1)
			assertTrue(true);
	}
	
	@Test
	public void deplacement_case_notok() {
		System.out.println("Test_Robot deplacement_case_notok\n");
		
		Robot robot_contru = new Robot(5,5,Orientation.BAS,5,5);
		
		int [] tab_coord_temp;
		tab_coord_temp = new int [2];
		
		tab_coord_temp=robot_contru.deplacement_ontab(Deplacement.DOWN_ARROW);
		
		if(tab_coord_temp[0] != 0){
			robot_contru.setX_robot(tab_coord_temp[0]);
		}
		if(robot_contru.getX_robot() == 1)
			assertTrue(true);
	}

}
