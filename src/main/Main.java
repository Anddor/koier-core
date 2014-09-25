package main;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

import koie.Koie;
import lagring.LagreKoier;
import lagring.LastKoier;

public class Main {
	
	static ArrayList<Koie> koieListe = new ArrayList<>();
	

	public static void main(String[] args) {
		//URL url = Main.class.getResource("koier.ser");
		//File filepath = new File(url.getPath());
		//String path = filepath.toString();
	
		
		Koie BjoerneHula = new Koie("Bj�rnehula", 7, 18);
		Koie MauerTua = new Koie("MauerTua", 4, 14);
		
		koieListe.add(BjoerneHula);
		koieListe.add(MauerTua);
		
		
		//new LagreKoier(path, koieListe);
		system.out.println(BjoerneHula);
		
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


