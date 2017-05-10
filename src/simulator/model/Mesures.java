package simulator.model;

public class Mesures {
	int nbr_commande=0;
	int nbr_obs_rencontre=0;
	int nbr_obs_visible=0;
	int distance=0;
	
	public int getCommande(){
		return this.nbr_commande;
	}
	
	public int getRencontre(){
		return this.nbr_obs_rencontre;
	}
	
	public int getVisible(){
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
	

}
