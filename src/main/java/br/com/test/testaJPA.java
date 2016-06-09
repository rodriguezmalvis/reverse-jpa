package br.com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pojos.Atendimento;
import br.com.pojos.Procedimento;
import br.com.pojos.Processo;
import br.com.pojos.ProcessoId;
import br.com.pojos.SubProcesso;

public class testaJPA {
	
	public static void main(String[] args) {
		
		pegaSubProcessoPeloID();
		
		System.out.println("FIM");
		
	}
	
	public static void pegaSubProcessoPeloID(){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("reverse-jpa");
		EntityManager manager = factory.createEntityManager();
				
		ProcessoId processoId = new ProcessoId(2259, new Short("2016"), 12);
		
		Processo processo = manager.find(Processo.class, processoId);
		
		System.out.println(processo);
		
		for (SubProcesso subProcesso : processo.getSubProcessos()) {
			System.out.println(subProcesso.getId());
			
			for (Atendimento atendimento : subProcesso.getAtendimentos()) {
				
				System.out.println(atendimento.getIdGuia() + " - " + atendimento.getId());
				
				for (Procedimento procedimento : atendimento.getProcedimentos()) {
					
					System.out.println(procedimento.getId());
					
				}
				
			}
			
		}

		manager.close();
		
	}

}
