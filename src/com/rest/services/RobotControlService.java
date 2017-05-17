package com.rest.services;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import simulator.controler.Game_Controller;
import simulator.model.Deplacement;


@Path("/cmd")
public class RobotControlService {
	
	private final static String ROBOT_SIMULATOR_LABEL="robot_simulator";
	private final static String MARCHE_LABEL="marche";
		
	Game_Controller jeu ;
	
	private boolean marche=true; // etat du robot
	private boolean login=true; // connexion ?
	
	//Inject servlet context (needed to get general context, application memory space, session memory space ...)
	@Context
	ServletContext context;
	
	//After RestService construction launches init method
		@PostConstruct
		public void init(){
			checkRobot();
		}

		
		private void checkRobot() {
			Object obj=context.getAttribute(ROBOT_SIMULATOR_LABEL);
			if(obj==null){

			}else{
				
			}
			
		}

		@POST
		@Produces(MediaType.TEXT_PLAIN)
		@Path("START")
		private void createGame() {
			jeu=new Game_Controller();
		}
		
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		@Path("CHECK1")
		public String showRobot() {
			return "showRobot Done";
		}
		
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		@Path("CHECK2")
		public String displayPath() {
			return "displayPath Done";
		}
		
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		@Path("CHECK3")
		public String displayObstacles() {
			return "displayObstacles Done";
		}
		
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		@Path("CHECK4")
		public String autoMapping() {
			return "auto-mapping Done";
		}
		
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		@Path("UP")
		public String goUp(String jsonData) {
			String etat="KO";
			if(this.marche==true){ // Robot en marche ?
	
				if(true) { // Bien connecté ?
					jeu.deplacement_robot(Deplacement.UP_ARROW);
					jeu.getEnvironnement_jeu().afficherEnvironnement();
					System.out.println("_________________________________________\n");
					System.out.println("Environnement du robot\n");
					jeu.getEnvironnement_robot().afficherEnvironnement();
					etat="OK";
				}
				
				JSONObject objAuth = new JSONObject();
				objAuth.put("UP ",etat);
				return objAuth.toJSONString();
			}
			
			return etat;
		}
		
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		@Path("DOWN")
		public String goDown(String jsonData) {
			String etat="KO";
			if(this.marche==true){ // Robot en marche ?
				
				if(true) { // Bien connecté ?
					jeu.deplacement_robot(Deplacement.DOWN_ARROW);
					jeu.getEnvironnement_jeu().afficherEnvironnement();
					System.out.println("_________________________________________\n");
					System.out.println("Environnement du robot\n");
					jeu.getEnvironnement_robot().afficherEnvironnement();
					etat="OK";
				}
				
				JSONObject objAuth = new JSONObject();
				objAuth.put("DOWN ",etat);
				return objAuth.toJSONString();
			}
			
			return etat;
		}
		
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		@Path("LEFT")
		public String goLeft(String jsonData) {
			String etat="KO";
			if(this.marche==true){ // Robot en marche ?
				
				if(true) { // Bien connecté ?
					jeu.deplacement_robot(Deplacement.LEFT_ARROW);
					jeu.getEnvironnement_jeu().afficherEnvironnement();
					System.out.println("_________________________________________\n");
					System.out.println("Environnement du robot\n");
					jeu.getEnvironnement_robot().afficherEnvironnement();
					etat="OK";
				}
				JSONObject objAuth = new JSONObject();
				objAuth.put("LEFT ",etat);
				return objAuth.toJSONString();
			}	
			return etat;
		}
		
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		@Path("RIGHT")
		public String goRight(String jsonData) {
			String etat="KO";
			if(this.marche==true){ // Robot en marche ?
				
				if(true) { // Bien connecté ?
					jeu.deplacement_robot(Deplacement.RIGHT_ARROW);
					jeu.getEnvironnement_jeu().afficherEnvironnement();
					System.out.println("_________________________________________\n");
					System.out.println("Environnement du robot\n");
					jeu.getEnvironnement_robot().afficherEnvironnement();
					etat="OK";
				}
				JSONObject objAuth = new JSONObject();
				objAuth.put("RIGHT ",etat);
				return objAuth.toJSONString();
			}		
			return etat;
		}
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("env")
		public String getEnv()
				{
			//create Json container Object
			JSONObject objContainer = new JSONObject();
			
			//create set of json objects
			JSONObject objVal1 = new JSONObject();
			objVal1.put("x",new Integer(0));
			objVal1.put("y",new Integer(0));
			objVal1.put("val","FREE");
			JSONObject objVal2 = new JSONObject();
			objVal2.put("x",new Integer(0));
			objVal2.put("y",new Integer(1));
			objVal2.put("val","WALL");
			JSONObject objVal3 = new JSONObject();
			objVal3.put("x",new Integer(1));
			objVal3.put("y",new Integer(1));
			objVal3.put("val","ROBOT");
			
			
			//create a json list
			JSONArray list = new JSONArray();
			//add json objects to jsonlist
			list.add(objVal1);
			list.add(objVal2);
			list.add(objVal3);
			
			//add jsonlist to json container
			objContainer.put("data", list);
			
			//return json string of the json container
			return objContainer.toJSONString();
			
			
			//ALTERNATIVE send direct a json String
			//return "{\"data\":[{\"x\":0,\"y\":0,\"val\":\"FREE\"},{\"x\":0,\"y\":1,\"val\":\"WALL\"},{\"x\":1,\"y\":1,\"val\":\"ROBOT\"}]}";
		}

}
