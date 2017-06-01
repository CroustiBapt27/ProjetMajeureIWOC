package view;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.lang.String;

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
	
	public int herbe = 1; //1
	public int bord = 30; //2
	public int obstacle = 10; //3
	
	/*public static void reactualiser_vue_Environnemenent(int matrice_env[][]){
	
					*/
					
					
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
					//syntaxe fausse mais l'id�e est l�
					
	public static String creation_matrice_JSON(int matrice_env[][], int x_robot,int y_robot,boolean show_robot){
		JSONObject objContainer = new JSONObject();

		objContainer.put("height",30);

			JSONObject layer_verdure = new JSONObject();

				JSONArray data_verdure = new JSONArray();
						
						for (int j=0;j<matrice_env.length;j++){ //parcours de la MATRICE du mod�le
							for (int k=0;k<matrice_env[0].length;k++){ //height
									if (matrice_env[j][k]==1){
										data_verdure.add(1);
									}
									else{
										data_verdure.add(1);
									}
							}
						}
				System.out.println(data_verdure);
				System.out.println(data_verdure.size());		
				
						
				layer_verdure.put("data", data_verdure);
				layer_verdure.put("height", 30);
				layer_verdure.put("name", "verdure");
				layer_verdure.put("opacity", 1);
				layer_verdure.put("type", "tilelayer");
				layer_verdure.put("visible", true);
				layer_verdure.put("width", 40);
				layer_verdure.put("x", 0);
				layer_verdure.put("y", 0);



				JSONObject layer_obstacles = new JSONObject();

				JSONArray data_obstacles = new JSONArray();

					
					for (int j=0;j<matrice_env.length;j++){ //parcours de la MATRICE du mod�le
						for (int k=0;k<matrice_env[0].length;k++){
								if (matrice_env[j][k]==3){
									data_obstacles.add(10);
								}
								else if (x_robot==j&&y_robot==k&&show_robot)
								{
									data_obstacles.add(30);
								}
								else{
									data_obstacles.add(0);
								}
						}
					}
				
				System.out.println(data_obstacles);
				System.out.println(data_obstacles.size());
				
				layer_obstacles.put("data", data_obstacles);
				layer_obstacles.put("height", 30);
				layer_obstacles.put("name", "Obstacles");
				layer_obstacles.put("opacity", 1);
				layer_obstacles.put("type", "tilelayer");
				layer_obstacles.put("visible", true);
				layer_obstacles.put("width", 40);
				layer_obstacles.put("x", 0);
				layer_obstacles.put("y", 0);

						
				JSONObject layer_black = new JSONObject();

				JSONArray data_black = new JSONArray();
				//for (int i=0;i<1200;i++) //1200 = 30 * 40

						
					for (int j=0;j<matrice_env.length;j++){ //parcours de la MATRICE du mod�le
						for (int k=0;k<matrice_env[0].length;k++){
								if (matrice_env[j][k]==2){
									data_black.add(2910);
								}
								
								else{
									data_black.add(0);
								}
						}
					}
				System.out.println(data_black);	
				System.out.println(data_black.size());
				
				layer_black.put("data", data_black);
				layer_black.put("height", 30);
				layer_black.put("name", "black");
				layer_black.put("opacity", 1);
				layer_black.put("type", "tilelayer");
				layer_black.put("visible", true);
				layer_black.put("width", 40);
				layer_black.put("x", 0);
				layer_black.put("y", 0);



			JSONArray layers = new JSONArray();
			layers.add(layer_verdure);
			layers.add(layer_obstacles);
			layers.add(layer_black);



		objContainer.put("layers",layers);

		objContainer.put("nextobjectid",1);
		objContainer.put("orientation","orthogonal");
		objContainer.put("renderorder","left-up");
		objContainer.put("tileheight",16);


			JSONArray tilesets = new JSONArray();
			JSONObject tileset1 = new JSONObject();

			tileset1.put("columns",8);
			tileset1.put("firstgid",1);
			tileset1.put("image","/ProjetMajeureIWOC/map/images/tileset-pkm.png");
			tileset1.put("imageheight",15971);
			tileset1.put("imagewidth",128);
			tileset1.put("margin",0);
			tileset1.put("name","pkm");
			tileset1.put("spacing",0);
			tileset1.put("tilecount",7984);
			tileset1.put("tileheight",16);
			tileset1.put("tilewidth",16);

			tilesets.add(tileset1);



		objContainer.put("tilesets",tilesets);

		objContainer.put("tilewidth",16);
		objContainer.put("version",1);
		objContainer.put("width",40);
		

		
		return objContainer.toJSONString();

	}
	
	
	
public static void main(String args[]){ //TEST
		
		Game_Controller jeu = new Game_Controller();
		
		matrix_height = jeu.getY_matrice();
		matrix_width = jeu.getX_matrice();	
		
		Environnement env = jeu.getEnvironnement_jeu();	
		
		int matrice_env[][] = jeu.getEnvironnement_jeu().getEnvironnement();

		System.out.println(matrice_env.length); //40 width
		System.out.println(matrice_env[0].length); //30 height
		
		for (int i=0; i<matrice_env.length; i++) {
			System.out.println("u");
			for (int j=0; j<matrice_env[0].length; j++){
				
				System.out.print(matrice_env[i][j]);
			}
		}
		
		
		//String json = creation_matrice_JSON(matrice_env);
		
		//System.out.println(json);

	}

	
	
}
