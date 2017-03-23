package metier;

import java.io.Serializable;

public class Compte implements Serializable{

	private static final long serialVersionUID = -2476827478601703016L;
	private int idCompte;
	private String nomCompte;
	private long solde;
	
	public int getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	public String getNomCompte() {
		return nomCompte;
	}
	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}
	public long getSolde() {
		return solde;
	}
	public void setSolde(long solde) {
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", nomCompte=" + nomCompte + ", solde=" + solde + "]";
	}
	
	
}
