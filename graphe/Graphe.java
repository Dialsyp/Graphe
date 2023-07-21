package graphe;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Graphe {
	
	static private NavigableMap<String, Sommet> MonGraphe = new TreeMap<String, Sommet>();

	static public void AddSommet(Sommet s) {
		if (!MonGraphe.containsKey(s.getNom())) MonGraphe.put(s.getNom(), s);
	}
	
	static public NavigableMap<String, Sommet> getGraphe() {
		return MonGraphe;
	}
	
	/*
	private List<Sommet> MonGraphe; 
	
	public Graphe() {
		MonGraphe = new ArrayList<Sommet>();
	}
	
	protected void AddSommet(Sommet s) {
		if (!MonGraphe.contains(s)) MonGraphe.add(s);
	}
	*/
	
}
