package fr.uvsq.solid.pglp_3;

public class Vendeur extends All_Employe 
{
	private final int base=2000;
	private final  double commission;
	public Vendeur (double commission)
	{
		this.commission=commission;
	}
	@Override
	public double calculsalaire() {
		// TODO Auto-generated method stub
		return this.base +this.commission;
	}
}
