package simulator.model;

public class Mesures {
	public static int nbr_commande=0;
	public static int nbr_obs_rencontre=0;
	public static int nbr_obs_visible=0;
	public static int distance=0;
	
	public int getNbr_commande(){
		return Mesures.nbr_commande;
	}
	
	public int getMbr_obs_rencontre(){
		return Mesures.nbr_obs_rencontre;
	}
	
	public int getMbr_obs_visible(){
		return Mesures.nbr_obs_visible;
	}
	
	public int getDistance(){
		return Mesures.nbr_obs_visible;
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
		Mesures.nbr_commande=nbr_commande;
	}
	
	public void setNbr_obs_rencontre(int nbr_obs_rencontre) {
		Mesures.nbr_obs_rencontre = nbr_obs_rencontre;
	}
	
	public void setNbr_obs_visible (int nbr_obs_visible){
		Mesures.nbr_obs_visible = nbr_obs_visible;
	}
	
	public void setDistance(int distance){
		Mesures.distance = distance;
	}
	

}
