package graphe;

import java.util.List;

public class Utilisateur extends Sommet {
	
	private String prenom;
	private int age;
	
	public Utilisateur(String nom, List<Sommet> s, String prenom, int age) {
		super(nom, s);
		this.age=age;
		this.prenom=prenom;
		
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-g=enerated method stub
		return "age " + age + " nom " + getNom() + " prenom " + prenom +" liste successe" + getSuccesseurs();
	}
	
}
