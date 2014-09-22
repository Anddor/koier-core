package lagring;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import main.Main;
import koie.Koie;

public class LastKoier {
	
	private String path;

	public LastKoier(String path) {
		this.path = path;
		readObjectsFromFile();
	}

	private void readObjectsFromFile() {

		try{
			//åpner input-strøm fra fil, til program
			FileInputStream inStream = new FileInputStream(path);
			//åpner strøm for lesing av objekter
			ObjectInputStream objInStream = new ObjectInputStream(inStream);
			
			//gå igjennom alle objekter og legger de i koielista
			Object k = null;
			while((k = objInStream.readObject() ) != null){
				Main.getKoieListe().add((Koie) k);
			}
			
			//lukker strømmer:
			objInStream.close();
			inStream.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("ERROR: filen finnes ikke!");
		}
		catch (IOException e){
			System.out.println("ERROR: fikk ikke lastet inn koier");
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR: Finner ingen objekter");
		}
		
		
		
	}
	
	

}
