package koie;
	
public class Koie implements java.io.Serializable {

	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 8011726356493345464L; //HVA ER DETTE!!!!
	private String koieNavn;
	//private double lengdegrad;
	//private double breddegrad;
	private double kgVed;

	public String info;

	private int antSenger;	
	
	//Constructor
	public Koie(String koieNavn, double kgVed, int antSenger){
		this.koieNavn = koieNavn;
		this.kgVed = kgVed;
		this.antSenger = antSenger;
		
		
		
	}
	@Override
	public String toString() {
		String str = "[koieNavn=" + this.koieNavn + " kgVed=" + this.kgVed + " antSenger=" + this.antSenger + "]";
		return str;
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

	public void setAntSenger(int antSenger) {
		this.antSenger = antSenger;
	}
	
	public String getInfo() {
		return info;
	}
	
	

}
