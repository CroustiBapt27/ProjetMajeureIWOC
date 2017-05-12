package simulator.model;

public class Environnement {
	private int[][] matrice_env;
	private int taille_x, taille_y;
	private double pourcentage_obstacle;
	
	public Environnement(int taille_x, int taille_y, double pourcentage_obstacle) { //contructeur pour les obstacles
		this.taille_x=taille_x;
		this.taille_y=taille_y;
		this.pourcentage_obstacle=pourcentage_obstacle;
		matrice_env=new int[taille_x][taille_y];
		geneEnvironnement();
	}
	
	public Environnement(int taille_x, int taille_y) { //contructeur pour le robot
		this.taille_x=taille_x;
		this.taille_y=taille_y;
		matrice_env=new int[taille_x][taille_y];
		geneEnvironnement_vide();
	}
	
	public int getTaille_x (){
		return this.taille_x;
	}
	
	public int getTaille_y (){
		return this.taille_y;
	}
	
	public double getPourcentage_obstacle(){
		return this.pourcentage_obstacle;
	}
	
	public void setTaille_x (int taille_x){
		this.taille_x=taille_x;
	}
	
	public void setTaille_y (int taille_y){
		this.taille_y=taille_y;
	}
	
	public void setPourcentage_obstacle(double pourcentage_obstacle){
		this.pourcentage_obstacle=pourcentage_obstacle;
	}
	
	public void geneEnvironnement (){
		for(int i = 0; i < taille_x; i++){					//remplissage de la grille
            for(int j = 0; j < taille_y; j++){
            	if(i==0 || i==taille_x-1||j==0||j==taille_y-1) {	//mise a 2 des bords (pour affichage)
            		matrice_env[i][j]=2;
            	}
            	else if(Math.random()<pourcentage_obstacle) {		//mise a 3 si obstacle
            		matrice_env[i][j]=3;
            	}
            	else{												//mise a 1 -> vide
            		matrice_env[i][j]=1;
            	}
            	
                System.out.print(matrice_env[i][j] + " ");
                
            }
		}
	}
	
	public void geneEnvironnement_vide(){
		for(int i = 0; i < taille_x; i++){					//remplissage de la grille
            for(int j = 0; j < taille_y; j++){
            	//mise a 0 des bords
            		matrice_env[i][j]=0;
            		
            		System.out.print(matrice_env[i][j] + " ");
            }
		}
	}
	
	public int getCellule(int x,int y) {
		return (this.matrice_env[x][y]);
	}
	
	public void setCellule(int x,int y) {
		this.matrice_env[x][y]=1;;
	}
	
	public int[][] getEnvironnement () {
		
		return this.matrice_env;
	}
	
	
	
	public void afficherEnvironnement() {
		for(int i = 0; i < matrice_env.length; i++){					
            for(int j = 0; j < matrice_env[0].length; j++){
            	System.out.print(matrice_env[i][j] + " ");
            }
            System.out.println();
		}
	}
	
	
	/*public static void main(String[] args) {		//test (a mettre en commentaire)
		Environnement grille= new Environnement(7,9,0.15); 
		grille.afficherEnvironnement();
	}*/
	
	
}
