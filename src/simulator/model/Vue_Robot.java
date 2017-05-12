package simulator.model;


import simulator.model.Environnement;
import simulator.model.Robot;
import simulator.model.Orientation;

public class Vue_Robot {
	private Environnement env_robot;
	private Orientation orientation;
	private int masque[][];
	
	/*public void Vue_Robot(Environnement env_robot, Orientation orientation) {
		this.orientation=orientation;
		this.env_robot=env_robot;
		int [][] masque={
		        { 0, 1, 0} , // tableau [0] de int
		        { 1, 1, 1}, // tableau [1] de int
		        { 1, 1, 1}, // tableau [1] de int
		        { 0, 1, 0} // tableau [1] de int
		    };
		this.masque=masque;
		
	}*/
		private int[][] orienter_masque(Orientation orientation) {
			if(orientation==Orientation.HAUT||orientation==Orientation.BAS) {
				int masque[][]={
				        { 0, 1, 0} , // tableau [0] de int
				        { 1, 1, 1}, // tableau [1] de int
				        { 1, 1, 1}, // tableau [2] de int
				        { 0, 1, 0} // tableau [3] de int
				    };
			}
			else {
				int masque[][]={
				        { 0, 1, 1, 0} , // tableau [0] de int
				        { 1, 1, 1, 1}, // tableau [1] de int
				        { 0, 1, 1, 0}, // tableau [2] de int
				    };
			}
			return masque;
		}
		
		private Environnement majEnvironnement(int x_robot, int y_robot, Environnement env_robot,Orientation orientation) {
			int [][] masque=orienter_masque(orientation);
			for(int j = 0; j < masque.length; j++){					//remplissage de la grille
	            for(int i = 0; i < masque[j].length; i++){ 
	            	if(masque[i][j]==1) {
	            		if(orientation==Orientation.HAUT) {
	            			env_robot[x_robot-1][y_robot-2]=1;
	            		}
	            		
	            	
	            }
	            	
	            }
			
		}

}
