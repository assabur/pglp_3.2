package fr.uvsq.solid.pglp_3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class Employe_test {
    private int salaire;
    private int startyear;
    Employe emp;
    Vendeur vendeur;
    Manager manager;
    ArrayList<All_Employe> entreprise = new ArrayList<All_Employe>();
    double total;
    
    @Before
    public void setup()
    {
    	salaire=1500;
    	startyear=2016;
    	emp=new Employe(startyear);
    	vendeur=new Vendeur(200);
    	manager=new Manager(3, 2016);
    	entreprise.add(emp);
    	entreprise.add(manager);
    	entreprise.add(vendeur);
    }
    
	@Test
	public void salaire_des_Employe_test() 
	{
		//assertTrue(emp.calculsalaire(startyear)==1580);
		for(int i=0; i<entreprise.size();i++)
		{
			total+=entreprise.get(i).calculsalaire();
		}
		
		System.out.println("salaire total des employes de l'entreprise est"+total);
	}

	

}
