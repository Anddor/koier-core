package lagring;
import java.sql.*;

public class database {
public static void main(String[] args) {
		
	
	//database db = new database();
	//brukerListe();
	//db.saveUsr("Marte", "marte123", "marte@mail.no");
	//db.pwdCheck("erik", "erik123");
		
	}
	// metode som lagrer bruker til databasen:
	public void saveUsr(String navn, String passord, String email){
		//url til db-server
		String url = "jdbc:mysql://129.241.160.113:3306/jonmf_koier";
		String user = "jonmf_databasep";
		String pwd = "bdpass99";
		
		// prøver å opprette kontakt med db server
				Connection conn = null;
				Statement statement = null;
				try {
					conn = DriverManager.getConnection(url, user, pwd);
			
					// lage spørring (statement) som skriver informasjon om studenter
					String query = "INSERT INTO Bruker (fornavn, email, passord) VALUES('" + navn 
							
							+ "','" + email
							+ "','" + passord
							+ "');";
					
					
					// klargjøre statement
					statement = conn.prepareStatement(query);
					
					// kjører query/spørring
					statement.executeUpdate(query);
					System.out.println("YO");
					// lukke tilkobling og statement
					statement.close();
					conn.close();
					
				} catch (SQLException e) {
					System.out.println(e + "hei");
				}
		
	}
	//metode som sjekker brukernavn opp mot passord i databasen
	public static void pwdCheck(String brukernavn, String passord){
		//url til db-server
		String url = "jdbc:mysql://129.241.160.113:3306/jonmf_koier";
		//brukernavn og passord:
		String user = "jonmf_databasep";
		String pwd = "bdpass99";
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			System.out.println(e);
		}
		//spørring til tabell Bruker:		
		String query = "select * from Bruker where fornavn ='" + brukernavn + "' and passord ='" + passord + "';";
		//klargjør statement:
		Statement statement = null;
		try {
			statement = conn.prepareStatement(query);
		} catch (SQLException e) {
			System.out.println(e);
		}
		//kjøre spørring
		ResultSet result = null;
		try {
			result = statement.executeQuery(query);
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		try {
			while(result.next()){
				int brukerId = result.getInt(1);
				String fName = result.getString(2);
				String sName = result.getString(3);
				String mail = result.getString(4);
				String pass = result.getString(5);
				
				System.out.println(brukerId + " " + fName + " " + sName + " "
						+ mail + " " + pass);
				
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		// stenge/lukke kommunikasjonen
		try {
			result.close();
			statement.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	// metode som skriver ut alle brukere
	public static void brukerListe(){
		// en url til db server -- 129.241.160.113:3306
		String url = "jdbc:mysql://129.241.160.113:3306/jonmf_koier";
		String user = "jonmf_databasep";
		String pwd = "bdpass99";
		
		

			
				// prøver å opprette kontakt med db server
				Connection conn = null;
				try {
					
					conn = DriverManager.getConnection(url, user, pwd);
				} catch (SQLException e) {
					System.out.println(e + "test");
				}
				
				// lage spørring (statement) som henter all informasjon om studenter
				String query = "SELECT * FROM Bruker;";
				
				// prøve å klargjøre statement
				Statement statement = null;
				try {
					statement = conn.prepareStatement(query);
				} catch (SQLException e) {
					System.out.println(e + "test2");
				}
				
				// prøve å fange data i resultatsett
				ResultSet result = null;
				try {
					result = statement.executeQuery(query);
				} catch (SQLException e) {
					System.out.println(e + "test3");
				}
				
				// prøve å gå igjennom resultatsett
				try {
					while(result.next()){
						int brukerId = result.getInt(1);
						String fName = result.getString(2);
						String sName = result.getString(3);
						String mail = result.getString(4);
						String pass = result.getString(5);
						
						System.out.println(brukerId + " " + fName + " " + sName + " "
								+ mail + " " + pass);
						
					}
				} catch (SQLException e) {
					System.out.println(e + "test4");
				}
				
				
				// stenge/lukke kommunikasjonen
				try {
					result.close();
					statement.close();
					conn.close();
				} catch (SQLException e) {
					System.out.println(e);
				}
	}
}
