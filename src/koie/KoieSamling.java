package koie;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class KoieSamling {
	private HashMap<String,Koie> koier;
	
	public KoieSamling() {
		koier = new HashMap<String,Koie>();
	}
	//methods adds a new Koie to the HashMap
	//returns false if there already is a key with that name
	//returns true if Koie is added to the HashMap
	public boolean addKoie(String key, Koie koie) {
		if(koier.containsKey(key)){
			return false;
		} else {
			koier.put(key,koie);
			return true;
		}
	}
	//Returns the koie object matching the name of the key
	public Koie getKoieByName(String key) {
		return koier.get(key);
	}
	
	// Method returns a set of all the names of all the koie objects in the hashmap
	public Set<String> getKoieNames() {
		return koier.keySet();
	}
	
	//Method loops through the entries in the hashmap.
	//All the info from the koie objects are added to a String for return.
	public String printKoieInfo() {
		Collection<Koie> col = koier.values();
		String str = "";
		for(Koie k : col) {
			str += k.toString();
			str += "\n";
		}
		return str;
	}
}
