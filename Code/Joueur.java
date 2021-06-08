public class Joueur extends Banque
{
	// Attributs
	private static int nbJoueur = 0;

	private int iScore;
	private String sCouleur;
	private Tuile[] ensBatiment;
	private Ouvrier[] ensOuvrier;
	private int iNumJoueur;


	public Joueur(String sCouleur)
	{
		super(3);
		this.iScore      = 0;
		this.sCouleur    = sCouleur;
		this.ensBatiment = new Tuile[5]; // Pour le futur c'est forcement le nombre de maison dispo  a la base
		this.ensOuvrier  = new Ouvrier[3]; // Depend toujours du nbJoueurs
		this.iNumJoueur  = ++ Joueur.nbJoueur;
	}

	public int getNumJoueur()
	{
		return this.iNumJoueur;
	}

	public void majScore(int i)
	{
		this.iScore+=i;
	}

	public String toString()
	{
		String sRet = "Joueur n°" + this.iNumJoueur + ", " +  " couleur : " + this.sCouleur+ "\n";
		sRet+=super.toString();
		return sRet;	

	}
}