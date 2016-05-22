package models;

import java.util.*;
import java.lang.*;
import java.math.BigDecimal;
import java.io.IOException;

import org.json.JSONException;

import play.*;
import play.db.ebean.*;
import play.data.validation.Constraints;
import play.mvc.Http;
import controllers.Session;

import javax.persistence.*;

@Entity
public class User extends Model{
	

	@Id
	public int id;
	
	//@Constraints.Required
	public String adresseMail;
	
	//@Constraints.Required
	public String username;
	
	//@Constraints.Required
	public String motDePasse;
	
	//@Constraints.Required
	public String adresseMaison;

	//@Constraints.Required
	public int codePostal;
	
	//@Constraints.Required
	public Date dateDeNaissance;
	
	//@Constraints.Required
	public String nom;
	
	public int permission;
	
	//@Constraints.Required
	public String prenom;
	
	//@Constraints.Required
	public String sexe;
	
	//@Constraints.Required
	public String ville;
	
	public static Finder<Long,User> find = new Finder(Long.class, User.class);

	public static List<User> all() {
		return find.all();
	}
	
	public static User findByUsername(String username) {
        return find.where().eq("username", username).findUnique();
	}

	public static User findById(Long id) {
        return find.ref(id);
	}
	
	public static void create(User user) {
		user.motDePasse = Session.encryptPassword(user.motDePasse);
		user.save();
	}

	public static void delete(Long id) {
		findById(id).delete();
	}

	public void update(User user) {
		user.motDePasse = Session.encryptPassword(user.motDePasse);
		user.update(this.id);
	}
	
    public static User authenticate(String username, String motDePasse) {
        User user = find.where().eq("username", username).findUnique();
        if (user != null && Session.checkPassword(motDePasse, user.motDePasse)) return user;
        return null;
    }
	

}
