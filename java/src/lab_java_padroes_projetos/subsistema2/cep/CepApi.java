package lab_java_padroes_projetos.subsistema2.cep;

import lab_java_padroes_projetos.gof.singleton.SingletonEager;

public class CepApi {

	private static CepApi instancia = new CepApi() ;

	private CepApi() {}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Barbacena";
	}
	
	public String recuperarEstado(String cep) {
		return "MG";
	}
	
}
