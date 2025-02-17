package oop.person_Train;

public class train {
	private int  aantelWielen;
	private int aantelPlaatsen;

	public Person conductur;

	public train(int aantelWielen, int aantelPlaatsen) {
		 this.aantelWielen = aantelWielen;
		 this.aantelPlaatsen = aantelPlaatsen;
	}

	public int getAantelWielen() {
		 return aantelWielen;
	}

	public void setAantelWielen(int aantelWielen) {
		 this.aantelWielen = aantelWielen;
	}

	public void  giveControl (Person newconductur) {
		 this.conductur = newconductur;
	}
}
