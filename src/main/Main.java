package main;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import koie.Koie;
import lagring.LagreKoier;
import lagring.LastKoier;

public class Main {
	
	static ArrayList<Koie> koieListe = new ArrayList<>();
	

	public static void main(String[] args) {
		//URL url = Main.class.getResource("koier.ser");
		//File filepath = new File(url.getPath());
		//String path = filepath.toString();
		
		new LastKoier(path);
		
		Koie BjørneHula = new Koie("BjørneHula", 7, 18);
		Koie MauerTua = new Koie("MauerTua", 4, 14);
		
		koieListe.add(BjørneHula);
		koieListe.add(MauerTua);
		
		
		new LagreKoier(path, koieListe);
		
		printKoier();
		
	}

	private static void printKoier() {
		for (Koie k : koieListe){
			System.out.println(k.getKoieNavn());
		}
		
	}

	public static ArrayList<Koie> getKoieListe() {
		return koieListe;
	}

	public static void setKoieListe(ArrayList<Koie> koieListe) {
		Main.koieListe = koieListe;
	}
	
	
}


