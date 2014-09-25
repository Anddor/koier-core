package main;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

import koie.Koie;
import koie.KoieSamling;
import lagring.LagreKoier;
import lagring.LastKoier;

public class Main {
	
	static ArrayList<Koie> koieListe = new ArrayList<>();
	

	public static void main(String[] args) {
		//URL url = Main.class.getResource("koier.ser");
		//File filepath = new File(url.getPath());
		//String path = filepath.toString();
	
		
		Koie bh = new Koie("Bj�rnehula", 7, 18);
		Koie mt = new Koie("MauerTua", 4, 14);
		
		KoieSamling koier = new KoieSamling();
		koier.addKoie("Bjoernehula", bh);
		koier.addKoie("Maurtua", mt);
		
		koier.addKoie("Klippekanten", new Koie("Klippekanten", 3, 8));
		
		
		//new LagreKoier(path, koieListe);
		System.out.println(koier.printKoieInfo());
		
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


