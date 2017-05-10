package simulator.model;

public class Environnement {
	private int[][] matrice_env;
	private int taille_x=10, taille_y=10;
	private int pourcentage_obstacle=5;
	
	public Environnement(int taille_x, int taille_y, double pourcentage_obstacle) {
		matrice_env=new int[taille_x][taille_y];	
		for(int i = 0; i < taille_x; i++){					//remplissage de la grille
            for(int j = 0; j < taille_y; j++){
            	if(i==0 || i==taille_x-1||j==0||j==taille_y-1) {	//mise a 0 des bords
            		matrice_env[i][j]=0;
            	}
            	else if(Math.random()<pourcentage_obstacle) {		//mise a 2 si obstacle
            		matrice_env[i][j]=2;
            	}
            	else{												//mise a 1 -> vide
            		matrice_env[i][j]=1;
            	}
            	
                //System.out.print(matrice_env[i][j] + " ");
                
            }
            //System.out.println();  
        }
	}
	
	public int getCellule(int x,int y) {
		return (this.matrice_env[x][y]);
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
