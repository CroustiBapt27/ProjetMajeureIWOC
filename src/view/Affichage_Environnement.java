package view;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import simulator.controler.*;
import simulator.model.Environnement;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;


public class Affichage_Environnement {
	
	
	
	public static int matrix_height;
	public static int matrix_width ;
	
	public int herbe = 1;
	public int bord = 30;
	public int obstacle = 10;
	
	public static void remplirEnvironnemenent(int matrice_env[][]){
		int indice = 0 ; 
	
		for(int j = 0; j < matrix_width; j++){ // parcours sur les lignes
			for(int k = 0; k < matrix_height; k++){ //parcours sur les colonnes
				if(matrice_env[j][k]==1){ //on teste si vide (herbe)	
					
					
					
					// A FAIRE, 
					//UTILISER PARSER POUR MODIFIER L'OBJET JSON
					// PROBLEME COMMENT LE LIRE DEPUIS WEBCONTENT
					
					/* Object obj = parser.parse(new FileReader("pkm.json"));

			            JSONObject jsonObject = (JSONObject) obj;
			            System.out.println(jsonObject);

			            String name = (String) jsonObject.get("name");
			            System.out.println(name);

			            long age = (Long) jsonObject.get("age");
			            System.out.println(age);

			            // loop array
			            JSONArray msg = (JSONArray) jsonObject.get("messages");
			            Iterator<String> iterator = msg.iterator();
			            
			            while (iterator.hasNext()) {
			                System.out.println(iterator.next());
			            }
			            */
					
					//System.out.println(pkm["layers"][0]["data"][i]);
					//syntaxe fausse mais l'idée est là
					
				}
				
				/*
				else if(matrice_env[j][k]==2){ //on teste si bord)
					layers{data[indice]} = bord; //on met un bord
				}
				else if(matrice_env[j][k]==3){ //on teste si obstacle
					layers{data[indice]} = obstacle; //on met un obstacle
				};*/
				
				indice++;
			}
			
		}
		System.out.println(matrice_env[2][3]); //test qui fonctionne	
	}
	
	
public static void main(String args[]){ //TEST
		
		Game_Controller jeu = new Game_Controller();
		
		matrix_height = jeu.getY_matrice();
		matrix_width = jeu.getX_matrice();	
		
		Environnement env = jeu.getEnvironnement_jeu();	
		
		int matrice_env[][] = jeu.getEnvironnement_jeu().getEnvironnement();

		env.afficherEnvironnement();
		remplirEnvironnemenent(matrice_env);
				
	}

	
	
}
