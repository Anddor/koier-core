package koie;

import java.util.HashMap;
import java.util.Set;


public class KoieSamling {
	private HashMap<String,Koie> koier;
	
	public KoieSamling() {
		
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
	public Koie getKoieByName(String key) {
		return koier.get(key);
	}
	public Set<String> getKoieNames() {
		return koier.keySet();
	}
}
