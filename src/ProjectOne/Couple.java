package ProjectOne;

public class Couple {
	boolean inRelation;

	String relationeWith;

	Couple(boolean inRelation, String relationeWith) {

		this.inRelation = inRelation;
		this.relationeWith = relationeWith;
	}

	public String getRelationeWith() {
		return relationeWith;
	}

	public void setRelation(boolean inRelation) {
		this.inRelation = inRelation;
	}

	public void setRelationeWith(String relationeWith) {
		this.relationeWith = relationeWith;
	}
}
