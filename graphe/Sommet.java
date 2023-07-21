package graphe;

import java.util.List;

public abstract class Sommet {
	
	private String nom;
	private List<Sommet> successeurs;
	
	public Sommet (String n, List<Sommet> s) {
		nom = n;
		successeurs = s;
		Graphe.AddSommet(this);
	}
	
	public List<Sommet> getSuccesseurs() {
		return successeurs;
	}
	
	public void setSuccesseurs(List<Sommet> v) {
		successeurs = v;
	}	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String n) {
		nom = n;
	}
	
	public void AddSuccesseur (Sommet v) {
		if (!successeurs.contains(v)) successeurs.add(v);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "je suis un sommet de type";
	}
}
