package metier;

public class ComptePayant extends Compte {

	private float pourcentage;

	/**
	 * constructeur 
	 * @param pourcentage pourcentage de frais
	 */
	public ComptePayant(float pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}
	/**
	 * constructeur 
	 * @param id id compte
	 * @param nom nom du compte
	 * @param solde solde du compte
	 * @param pourcentage pourcentage
	 */

	public ComptePayant(int id, String nom, float solde, float pourcentage) {
		super(id, nom, solde);
		this.pourcentage = pourcentage;
	}

	public float getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}

	@Override
	public String toString() {
		return "ComptePayant [pourcentage=" + pourcentage + ", toString()=" + super.toString() + "]";
	}

	@Override
	public float verser(float mt) {
		if(mt>=0)
		{
			this.solde=solde+mt-(mt*pourcentage)/100;
		}
		
		return solde;
	}

	@Override
	public float retirer(float mt) {
		if(mt>=0){
			if(mt+(mt*pourcentage)/100 <= solde)
			{
				this.solde=solde-mt-(mt*pourcentage)/100;
			}
		}
		
		return solde;
	}
	
	
	
}
