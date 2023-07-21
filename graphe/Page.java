package graphe;

import java.util.List;

public class Page extends Sommet {
	
	private List<Sommet> admin;
	
	public Page(String nom, List<Sommet> admin) {
		super(nom, null);
		this.admin = admin;
	}
	
	public List<Sommet> getAdmin() {
		return admin;
	}
	
	public void setAdmin(List<Sommet> admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" page";
	}
}
