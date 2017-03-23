package metier;

public class CompteEpargne extends Compte {

	private float taux;

	public CompteEpargne(float taux) {
		super();
		this.taux = taux;
	}

	public CompteEpargne(int id, String nom, float solde, float taux) {
		super(id, nom, solde);
		this.taux = taux;
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + ", toString()=" + super.toString() + "]";
	}
	/**
	 * Calcul inter�ts 
	 * @return inter�t calcul�s
	 */
	public float calculInterets()
	{
		return solde*taux;
	}
}
