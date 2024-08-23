package lab_java_padroes_projetos.gof;

/**
 * Singleton "apressado"
 * 
 * @autor eloizaams
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager() ;

	private SingletonEager() {}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
	
}