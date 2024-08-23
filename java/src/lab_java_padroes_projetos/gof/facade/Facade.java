package lab_java_padroes_projetos.gof.facade;

import lab_java_padroes_projetos.subsistema1.crm.CrmService;
import lab_java_padroes_projetos.subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
		
	}

}
