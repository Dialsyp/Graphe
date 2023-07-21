package graphe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableMap;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int utilisateur;
		int page;
		System.out.print("entrez le nombre d'utilisateur ");
		utilisateur=sc.nextInt();
		System.out.print("entrez le nombre de pages ");
		page=sc.nextInt();
		System.out.println("utilisatuer "+utilisateur+" page "+ page);
		
		Sommet s;
		for(int i = 0; i < utilisateur; ++i) {
			while (true) {
				String n;
				System.out.print("entrez le nom d'utilisateur " + (i+1) + " ");
				n = sc.next();
				if (Graphe.getGraphe().containsKey(n)) {
					System.out.println("nom exist");
					continue;
				}
				String p;
				System.out.print("entrez le prenom d'utilisateur " + (i+1) + " ");
				p = sc.next();
				int age;
				System.out.print("entrez l'age d'utilisateur " + (i+1) + " ");
				age = sc.nextInt();			
				s = new Utilisateur(n, new ArrayList<Sommet>(), p, age);
				break;
			}
		}
		
		for(int i = 0; i < page; ++i) {
			while (true) {
				String n;
				System.out.print("entrez le nom de la page " + (i+1) + " ");
				n = sc.next();
				if (Graphe.getGraphe().containsKey(n)) {
					System.out.println("nom exist");
					continue;
				}
				s = new Page(n,new ArrayList<Sommet>());
				break;
			}
		}	
		
		NavigableMap<String, Sommet> l = Graphe.getGraphe();		
		System.out.println(l);
		 
		/*
		List<Sommet> listSommet1 = new  ArrayList<Sommet>();
		
		Utilisateur s1 = new Utilisateur("dial", new ArrayList<Sommet>(), "", 0);
		Utilisateur s2 =new Utilisateur("Sommet2", new ArrayList<Sommet>(), "", 0);
		Utilisateur s3= new Utilisateur("Sommet3", new ArrayList<Sommet>(), "", 0);
		Utilisateur s4 = new Utilisateur("Sommet4", new ArrayList<Sommet>(), "", 0);
		Utilisateur s5 = new Utilisateur("Sommet5", new ArrayList<Sommet>(), "", 0);
		
		listSommet1.add(s3);
		listSommet1.add(s2);
		listSommet1.add(s4);	
		for () {
			Utilisateur 
		}*/
	}

}
