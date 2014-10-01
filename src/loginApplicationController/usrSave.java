package loginApplicationController;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class usrSave {
	
	public void writeToFile(String usrname, String password, String email, boolean admin){
		try {
			String foo;
			if(admin){
				foo = "1";
			} else {
				foo = "0";
			}
			
			String content = usrname+" "+password+" "+email+" "+foo;
 
			File file = new File("/users/usr/usr.txt");
 
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
