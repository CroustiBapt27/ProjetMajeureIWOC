package simulator.model;

public class Robot {
	private int x_robot;
	private int y_robot;
	private int envi_robot[][];
	private char orient_robot;
	
	public Robot(int x_robot,int y_robot,char orient_robot){
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

	public char getOrient_robot() {
		return orient_robot;
	}
	public void deplacementRobot(char sens_deplacement) {	//rajouter conditions si robot au bords
		if(sens_deplacement=='N') {
			this.y_robot++;
			this.orient_robot='N';
		}
		if(sens_deplacement=='S') {
			this.y_robot--;
			this.orient_robot='S';
		}
		if(sens_deplacement=='E') {
			this.x_robot++;
			this.orient_robot='E';
		}
		if(sens_deplacement=='W') {
			this.x_robot--;
			this.orient_robot='W';
		}
	}
	

}
