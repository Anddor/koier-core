package koie;
	
public class Koie implements java.io.Serializable {

	
	private String koieNavn;
	//private double lengdegrad;
	//private double breddegrad;
	private double kgVed;
	private double antSenger;	
	
	//Constructor
	public Koie(String koieNavn, double kgVed, double antSenger){
		this.koieNavn = koieNavn;
		this.kgVed = kgVed;
		this.antSenger = antSenger;
		
		
		
	}

	
	//Gettere og settere for alle variabler
	public String getKoieNavn() {
		return koieNavn;
	}

	public void setKoieNavn(String koieNavn) {
		this.koieNavn = koieNavn;
	}

	public double getKgVed() {
		return kgVed;
	}

	public void setKgVed(double kgVed) {
		this.kgVed = kgVed;
	}

	public double getAntSenger() {
		return antSenger;
	}

	public void setAntSenger(double antSenger) {
		this.antSenger = antSenger;
	}
	
	

}
