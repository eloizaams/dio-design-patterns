package lab_java_padroes_projetos.gof;


/**
 * Singleton "preguiçoso"
 * 
 * @autor eloizaams
 */
public class SingletonLazy {

	private static SingletonLazy instancia;

	private SingletonLazy() {}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null)
			instancia = new SingletonLazy();
		return instancia;
	}

	
}
