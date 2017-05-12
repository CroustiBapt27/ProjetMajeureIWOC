package simulator.model;

public class Robot {
	private int x_robot;
	private int y_robot;
	private Environnement envi_robot; //matrice 0 case non vu, 1 case vu, 2 case vu avec obstacle
	private Orientation orient_robot;
	private Mesures mesures_robot;
	
	public Robot(int x_robot,int y_robot,Environnement envi_robot, Orientation orient_robot){
		this.x_robot=x_robot;
		this.y_robot=y_robot;
		this.envi_robot=envi_robot;
		this.orient_robot=orient_robot;
		this.mesures_robot = new Mesures();
	}

	public int getX_robot() {
		return x_robot;
	}

	public int getY_robot() {
		return y_robot;
	}

	public Environnement getEnvi_robot() {
		return envi_robot;
	}

	public Orientation getOrient_robot() {
		return orient_robot;
	}
	
	public Mesures getMesures_robot(){
		return this.mesures_robot;
	}
	
	//etape 2 dans le controler, regarde si le 
	
}
