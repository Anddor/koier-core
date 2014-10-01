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
	public Koie getKoieByName(String key) {
		return koier.get(key);
	}
	public Set<String> getKoieNames() {
		return koier.keySet();
	}
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
