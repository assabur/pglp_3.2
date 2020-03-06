package fr.uvsq.solid.pglp_3;

public class Manager extends All_Employe
{
	private final int nbre_sous_ordre;
	private final double salaire =1500;
	private  int startyear;	
	public Manager (int nbre_sous_ordre,int startyear)
	{
		this.startyear=startyear;
		this.nbre_sous_ordre=nbre_sous_ordre;
	}
	@Override
	public double calculsalaire() 
	{
		// TODO Auto-generated method stub
		return this.salaire+(2020-this.startyear)*20+100*this.nbre_sous_ordre;
	}
}
