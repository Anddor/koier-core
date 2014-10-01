package loginApplicationController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class usrRead {
	
	@SuppressWarnings("finally")
	public ArrayList<usr> readFromFile() throws IOException{
		   BufferedReader br = new BufferedReader(new FileReader("/users/usr/usr.txt"));
		   
		   ArrayList<usr> al = new ArrayList<usr>();
		   
		    try {
		        String line = br.readLine();
		        while (line != null) {
		        	String[] foo = line.split(" ");
		        	if (foo[4].equals("1"))
			        	al.add(new usr(foo[0],foo[1],foo[2],true));
		        	else
			        	al.add(new usr(foo[0],foo[1],foo[2],false));
		            line = br.readLine();
		        }
		    } finally {
		        br.close();
		        return al;
		    }
	}


}
