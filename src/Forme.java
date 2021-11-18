public abstract class Forme{
  protected static double surface= 55.0;
  protected String couleur;

  public void setCouleur(String couleur){
    this.couleur=couleur ;
  }

  public abstract double calculerSurface() ;
  public abstract String getCouleur() ;
public abstract boolean ajouteForme(Forme f);
}
