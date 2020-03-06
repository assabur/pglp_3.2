package fr.uvsq.solid.pglp_3;

public class Employe extends All_Employe 
{
	private final double salaire=1500;
	private int startyear;
	public Employe(int startyear)
	{
		this.startyear=startyear;
	}
	@Override
	public double calculsalaire() {
		// TODO Auto-generated method stub
		return this.salaire+(2020-this.startyear)*20;
	}
}
