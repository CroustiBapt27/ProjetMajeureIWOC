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
					//syntaxe fausse mais l'idée est là
					
	public static String creation_matrice_JSON(int matrice_env[][]){
		JSONObject objContainer = new JSONObject();

		objContainer.put("height",30);

			JSONObject layer_verdure = new JSONObject();

				JSONArray data_verdure = new JSONArray();
				//for (int i=0;i<1200;i++){ //1200 = 30 * 40						
						for (int j=0;j<matrice_env.length;j++){ //parcours de la MATRICE du modèle
							for (int k=0;k<matrice_env.length;k++){
									if (matrice_env[j][k]==1){
										data_verdure.add(1);
									}
							}
						}
				System.out.println(data_verdure);
				
				
						
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
				//for (int i=0;i<1200;i++) //1200 = 30 * 40
					
					for (int j=0;j<matrice_env.length;j++){ //parcours de la MATRICE du modèle
						for (int k=0;k<matrice_env.length;k++){
								if (matrice_env[j][k]==3){
									data_obstacles.add(10);
								}
						}
					}
						
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

						
					for (int j=0;j<matrice_env.length;j++){ //parcours de la MATRICE du modèle
						for (int k=0;k<matrice_env.length;k++){
								if (matrice_env[j][k]==2){
									data_black.add(2910);
								}
						}
					}
						
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
		
		System.out.print(objContainer);
		
		return objContainer.toJSONString();

			/* -----------------caractéristiques communes ---------

		JSONObject height = new JSONObject();
			height.put("height", new Integer(30));



		JSONObject height_little = new JSONObject();
			height_little.put("height", new Integer(30));



		JSONObject opacity = new JSONObject();
			opacity.put("opacity", new Integer(1));

		JSONObject type = new JSONObject();
				type.put("type","tilelayer");

		JSONObject visible = new JSONObject();
				visible.put("visible",true);

		JSONObject width_little = new JSONObject();
			width_little.put("height", new Integer(30));

		JSONObject x = new JSONObject();
			x.put("x", new Integer(0));
		JSONObject y = new JSONObject();
			y.put("y", new Integer(0));

		-----------------caractéristiques communes ---------*/



			/* -----------------caractéristiques communes ---------
		JSONObject nextobjectid = new JSONObject();
			nextobjectid.put("nextobjectid", new Integer(1));

		JSONObject orientation = new JSONObject();
				orientation.put("orientation","orthogonal");

		JSONObject renderorder = new JSONObject();
				renderorder.put("renderorder","left-up");

		JSONObject tileheight = new JSONObject();
			tileheight.put("tileheight", new Integer(16));

			 -----------------caractéristiques communes ---------*/



		/*

		JSONArray tilesets = new JSONArray();
			JSONObject columns = new JSONObject();
				columns.put("columns", new Integer(8));
			JSONObject firstgid = new JSONObject();
				firstgid.put("firstgid", new Integer(1));
			JSONObject image = new JSONObject();
				image.put("image","\/ProjetMajeureIWOC/map\/images\/tileset-pkm.png");
			JSONObject imageheight = new JSONObject();
				imageheights.put("imageheight", new Integer(15971));
			JSONObject imagewidth = new JSONObject();
				imagewidth.put("imagewidth", new Integer(128));
			JSONObject margin = new JSONObject();
				margin.put("margin", new Integer(0));
			JSONObject name = new JSONObject();
				name.put("name","pkm");
			JSONObject spacing = new JSONObject();
				spacing.put("spacing", new Integer(0));
			JSONObject tilecount = new JSONObject();
				tilecount.put("tilecount", new Integer(7984));
			JSONObject tileheight_little = new JSONObject();
				tileheight_little.put("tileheight", new Integer(16));
			JSONObject tilewidth_little = new JSONObject();
				tilewidth_little.put("tilewidth", new Integer(16));

		tilesets.add(columns);
		tilesets.add(firstgid);
		tilesets.add(image);
		tilesets.add(imageheight);
		tilesets.add(imagewidth);
		tilesets.add(margin);
		tilesets.add(name);
		tilesets.add(spacing);
		tilesets.add(tilecount);
		tilesets.add(tileheight_little);
		tilesets.add(tilewidth_little);

		*/
			/* -----------------caractéristiques communes ---------*/
		/*

		JSONObject tilewidth= new JSONObject();
			tilewidth.put("tilewidth", new Integer(16));

		JSONObject version = new JSONObject();
			version.put("version", new Integer(1));

		JSONObject width = new JSONObject();
			width.put("width", new Integer(40));

		*/







		
	}
	
	
	
public static void main(String args[]){ //TEST
		
		Game_Controller jeu = new Game_Controller();
		
		matrix_height = jeu.getY_matrice();
		matrix_width = jeu.getX_matrice();	
		
		Environnement env = jeu.getEnvironnement_jeu();	
		
		int matrice_env[][] = jeu.getEnvironnement_jeu().getEnvironnement();

		/*env.afficherEnvironnement();
		
		reactualiser_vue_Environnemenent(matrice_env);*/
		
		
		System.out.println(matrice_env.length);
		/*for (int i=0; i<matrice_env.length; i++) {
			for (int j=0; j<matrice_env[0].length; j++){
				
				System.out.println(matrice_env[i][j]);
			}
		}
		*/
		String json = creation_matrice_JSON(matrice_env);
		
		System.out.println(json);
		/* JSONObject obj = new JSONObject();

	      obj.put("name", "foo");
	      obj.put("num", new Integer(100));
	      obj.put("balance", new Double(1000.21));
	      obj.put("is_vip", new Boolean(true));

	      System.out.print(obj);
				*/
	}

	
	
}
