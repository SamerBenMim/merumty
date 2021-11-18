
public class Test {
public static void main(String[] args)
{
	SingleForme f1=new SingleForme();
	f1.setCouleur("vert");
	SingleForme f2=new SingleForme();
	f2.setCouleur("rouge");
	CompoundForme f=new CompoundForme();
	f.setCouleur("jaune");
	f.ajouteForme(f1);
	f.ajouteForme(f2);
	System.out.println(f.getCouleur()+"  "+f.calculerSurface());
			
	
	
}
}
