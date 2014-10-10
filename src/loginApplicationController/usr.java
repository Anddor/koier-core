package loginApplicationController;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class usr {
	
	private String usrname;
	private String password;
	private String email;
	private boolean admin;
	
	
	public usr(String usrname, String password, String email, boolean admin){
		if (!(usrname.isEmpty() || password.isEmpty() || email.isEmpty())){
			if (email.contains("@")){
				this.email = email;				
			}
			this.password = password;
			this.usrname = usrname;
			this.admin = admin;
		} else {
			throw new IllegalArgumentException("Dumming");
		}
		
	}
	
/*	public void writeToFile(){
		try {
			String foo;
			if(admin){
				foo = "1";
			} else {
				foo = "0";
			}
			
			String content = this.usrname+" "+this.password+" "+this.email+" "+foo;
 
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
	
	
	@SuppressWarnings("finally")
	public ArrayList<String> readFromFile() throws IOException{
		   BufferedReader br = new BufferedReader(new FileReader("/users/usr/usr.txt"));
		   
		   ArrayList<String> al = new ArrayList<String>();
		   
		    try {
		        String line = br.readLine();
		        while (line != null) {
		        	al.add(line);
		            line = br.readLine();
		        }
		    } finally {
		        br.close();
		        return al;
		    }
	}
*/
	
	
	public String getUsrname(){
		return usrname;
	}
	
	public void setUsrname(String usrname){
		if (!(usrname.isEmpty())){
			this.usrname = usrname;			
		}
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		if (!(email.isEmpty())){
			this.email = email;			
		}
	}
	public void setPassword(String password){
		if (!(password.isEmpty())){
			this.password = password;			
		}
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public boolean getAdmin(){
		return this.admin;
	}

}
