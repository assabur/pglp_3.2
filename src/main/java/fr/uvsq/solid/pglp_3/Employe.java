package fr.uvsq.solid.pglp_3;

public class Employe extends All_Employe {

	private final double salaire=1500;
	private int startyear;

	@Override
	public double calculsalaire(int startyear) {
		// TODO Auto-generated method stub
		return salaire+(2020-startyear)*20;
	}
	
	
}
