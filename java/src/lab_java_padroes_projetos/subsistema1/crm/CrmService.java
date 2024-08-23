package lab_java_padroes_projetos.subsistema1.crm;

public class CrmService {
	
	private CrmService() {
	}

	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Clinte salvo no sistema de CRM:");
		System.out.println(nome);
		System.out.println(cidade);
		System.out.println(estado);
	}
}
