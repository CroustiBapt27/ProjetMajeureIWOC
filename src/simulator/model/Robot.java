package simulator.model;

public class Robot {
	private int x_robot;
	private int y_robot;
	private int envi_robot[][];
	private Orientation orient_robot;
	
	public Robot(int x_robot,int y_robot,Orientation orient_robot){
		this.x_robot=x_robot;
		this.y_robot=y_robot;
		this.orient_robot=orient_robot;
		
		
	}

	public int getX_robot() {
		return x_robot;
	}

	public int getY_robot() {
		return y_robot;
	}

	public int[][] getEnvi_robot() {
		return envi_robot;
	}

	public Orientation getOrient_robot() {
		return orient_robot;
	}
	public void deplacementRobot(Deplacement sens_deplacement) {	//rajouter conditions si robot au bords
		if(Deplacement.UP_ARROW.equals(sens_deplacement)) {
			this.y_robot++;
			this.orient_robot=Orientation.HAUT;
		}
		if(Deplacement.DOWN_ARROW.equals(sens_deplacement)) {
			this.y_robot--;
			this.orient_robot=Orientation.BAS;
		}
		if(Deplacement.RIGHT_ARROW.equals(sens_deplacement)) {
			this.x_robot++;
			this.orient_robot=Orientation.DROITE;
		}
		if(Deplacement.LEFT_ARROW.equals(sens_deplacement)) {
			this.x_robot--;
			this.orient_robot=Orientation.GAUCHE;
		}
	}
	

}
