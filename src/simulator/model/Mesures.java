package simulator.model;

public class Mesures {
	private int nbr_commande=0;
	private int nbr_obs_rencontre=0;
	private int nbr_obs_visible=0;
	private int distance=0;
	
	public int getNbr_commande(){
		return this.nbr_commande;
	}
	
	public int getMbr_obs_rencontre(){
		return this.nbr_obs_rencontre;
	}
	
	public int getMbr_obs_visible(){
		return this.nbr_obs_visible;
	}
	
	public int getDistance(){
		return this.nbr_obs_visible;
	}
	
	public void majCommande(){
		nbr_commande += 1;
	}
	
	public void majRencontre(){
		nbr_obs_rencontre += 1;
	}
	
	public void majVisible(){
		nbr_obs_visible +=1;
	}
	
	public void majDistance(){
		distance +=1;
	}
	
	
	
	public void setNbr_Commande(int nbr_commande){
		this.nbr_commande=nbr_commande;
	}
	
	public void setNbr_obs_rencontre(int nbr_obs_rencontre) {
		this.nbr_obs_rencontre = nbr_obs_rencontre;
	}
	
	public void setNbr_obs_visible (Environnement envi_robot){
		int nb_obstacle=0;
		for(int i = 0; i < envi_robot.getTaille_x(); i++){					
            for(int j = 0; j < envi_robot.getTaille_y(); j++){
            	if(envi_robot.getCellule(i, j)==3) {
            		nb_obstacle++;
            	}
            }
		}
		this.nbr_obs_visible=nb_obstacle;
	}
	
	public void setDistance(int distance){
		this.distance = distance;
	}
	

}
