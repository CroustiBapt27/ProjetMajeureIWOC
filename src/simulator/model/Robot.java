package simulator.model;

public class Robot {
	private int x_robot;
	private int y_robot;
	private Environnement envi_robot; //matrice 0 case non vu, 1 case vu, 2 case vu avec obstacle
	private Orientation orient_robot;
	private Mesures mesures_robot;
	
	public Robot(int x_robot,int y_robot, Orientation orient_robot, int x_matrice, int y_matrice){
		this.x_robot=x_robot;
		this.y_robot=y_robot;
		this.envi_robot=new Environnement(x_matrice,y_matrice);
		this.orient_robot=orient_robot;
		this.mesures_robot = new Mesures();
	}
	
	
	//getter setter
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

	public void setX_robot(int x_robot) {
		this.x_robot = x_robot;
	}

	public void setY_robot(int y_robot) {
		this.y_robot = y_robot;
	}

	public void setEnvi_robot(Environnement envi_robot) {
		this.envi_robot = envi_robot;
	}

	public void setOrient_robot(Orientation orient_robot) {
		this.orient_robot = orient_robot;
	}

	public void setMesures_robot(Mesures mesures_robot) {
		this.mesures_robot = mesures_robot;
	}
	
	
	public boolean deplacement_ontab(Deplacement arrow){ //vérifie la sortie de case
		boolean val_deplacement_ontab=false;
		if(Deplacement.UP_ARROW.equals(arrow) && y_robot < envi_robot.getTaille_y()) {
			this.orient_robot=Orientation.HAUT;
			val_deplacement_ontab =true;
		}
		if(Deplacement.DOWN_ARROW.equals(arrow) && y_robot > 1) {
			this.orient_robot=Orientation.BAS;
			val_deplacement_ontab = true;
		}
		if(Deplacement.RIGHT_ARROW.equals(arrow) && x_robot < envi_robot.getTaille_x()) {
			this.orient_robot=Orientation.DROITE;
			val_deplacement_ontab = true;
		}
		if(Deplacement.LEFT_ARROW.equals(arrow) && x_robot > 1 ) {		
			this.orient_robot=Orientation.GAUCHE;
			val_deplacement_ontab=true;
		}
		
		if(val_deplacement_ontab){
			mesures_robot.majCommande();
			
		}
		
		return val_deplacement_ontab;
	}
	
	

}
