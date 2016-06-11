package br.com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pojos.suporte.Amb;
import br.com.pojos.suporte.AmbId;

public class testaJPA {
	
	public static void main(String[] args) {
		
		pegaSubProcessoPeloID();
		
		System.out.println("FIM");
		
	}
	
	public static void pegaSubProcessoPeloID(){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("reverse-jpa-local");
		EntityManager manager = factory.createEntityManager();
		
		Amb amb = manager.find(Amb.class, new AmbId(10101012, 44));
		
		System.out.println(amb);
		manager.close();
		
	}

}
