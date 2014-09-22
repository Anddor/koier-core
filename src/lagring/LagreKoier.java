package lagring;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import koie.Koie;

public class LagreKoier {
	private String path;
	
	// en objekt-liste over alle koiene:
	ArrayList<Koie> objList = new ArrayList<>();

	// Constructor
	public LagreKoier(String path, ArrayList<Koie> koieListe) {
		this.path = path;
		this.objList = koieListe;
		writeToSerFile(); //kaller metoden writeToSerFile
	}

	private void writeToSerFile() {
		delFileContent();
		
		try{
			// �pne filstr�m
			FileOutputStream outStream = new FileOutputStream(path);
			//�pne for objektstr�m til fil
			ObjectOutputStream objOutStream = new ObjectOutputStream(outStream);
			//itererer gjennom alle objekter i listen og skriver de til fila
			for(Object obj : objList){
				objOutStream.writeObject(obj);
			}
			// lukker alle str�mmer
			objOutStream.close();
			outStream.close();
		}
		//fanger eventuelle feil:
		catch(FileNotFoundException e) {
			System.out.println("ERROR: filen som skal fylles finnes ikke");
		} 
		
		catch (IOException e) {
			System.out.println("ERROR: kan ikke �pne objektstr�m til fil");
		}
		
		
	}

	private void delFileContent() {
		try{
			//oppretter filstr�m:
			FileOutputStream overWrite = new FileOutputStream(path);
			//overskriver data i filen med en tom string:
			overWrite.write((new String().getBytes()));
			//lukker filstr�m:
			overWrite.close();
		}
		//fanger eventuelle feil:
		catch (IOException e) {
			System.out.println("ERROR: Finner ikke filen");
		}
	}
	
	
	
}
