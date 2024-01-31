package ProjectOne.attribute.emotion;

public class Couple {
	public boolean inRelation;

	private String relationeWith;

	private int together;

	public Couple(boolean inRelation, String relationeWith, int together) {

		this.inRelation = inRelation;
		this.relationeWith = relationeWith;
		this.together = together;
	}

	public String getRelationeWith() {
		return relationeWith;
	}

	public int getTogether() {
		return together;
	}

	public void setRelation(boolean inRelation) {
		this.inRelation = inRelation;
	}

	public void setRelationeWith(String relationeWith) {
		this.relationeWith = relationeWith;
	}

	public void setTogether(int together) {
		this.together = together;
	}
}

