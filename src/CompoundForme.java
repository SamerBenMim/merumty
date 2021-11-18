import java.util.Vector;
public class CompoundForme extends Forme {
	private Vector<Forme> children=new Vector();
	public double calculerSurface() {
		// TODO Auto-generated method stub
		double s=0;
		for(int i=0;i<children.size();i++)
		{
			s+=children.get(i).calculerSurface();
		}
		return(s);
	}

	@Override
	public String getCouleur() {
		// TODO Auto-generated method stub
		String s="";
		for(int i=0;i<children.size();i++)
		{
			s+=" "+children.get(i).getCouleur();
		}
		return (s+" "+couleur);
	}

	@Override
	public boolean ajouteForme(Forme f) {
		// TODO Auto-generated method stub
		children.add(f);
		return true;
	}

}
