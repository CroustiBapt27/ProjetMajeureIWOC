package usermanagement.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class UserModelBean implements Serializable{
	
	// Propiétés :
	private String	lastname;
	private String	surname;
	private String 	login;
	private String 	pwd;
	private int age;
	
	// Constructeur sans paramètres (contrainte du bean) :
	public UserModelBean() {
	}
	// Constructeur :
	public UserModelBean(String lastname,String surname,int age,String login,String pwd)
	{
		this.lastname	=	lastname;
		this.surname	=	surname;
		this.login		=	login;
		this.pwd 		=	pwd;
		this.age 		= 	age;
	}
	
	// Accesseurs noramlisés :
	public String getLastname() 				{ return lastname; }
	public void setLastname(String lastname) 	{ this.lastname = lastname; }
	public String getSurname() 					{ return surname;}
	public void setSurname(String surname) 		{ this.surname = surname; }
	public String getLogin() 					{ return login; }
	public void setLogin(String login) 			{ this.login = login; }
	public String getPwd() 						{ return pwd; }
	public void setPwd(String pwd) 				{ this.pwd = pwd; }
	public int getAge()							{ return age; 	}
	public void setAge(int age)					{this.age = age; }
	
	@Override
	public String toString() {
	return "[SURNAME]:"+this.getSurname()+",[LASTNAME]:"+this.getLastname()+",[LOGIN]:"+this.getLogin()+",[PWD]:"+this.getPwd();
	}
}