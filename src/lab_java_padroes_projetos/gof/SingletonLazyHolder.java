package lab_java_padroes_projetos.gof;


/**
 * Singleton "Lazy Holder" - melhor opção
 * 
 * @autor eloizaams
 */
public class SingletonLazyHolder {

	private static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder() ;
	}
	
	private SingletonLazyHolder() {}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
	
}