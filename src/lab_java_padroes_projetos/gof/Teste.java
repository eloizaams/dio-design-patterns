package lab_java_padroes_projetos.gof;

public class Teste {
	public static void main(String[] args) {

		//o endereço de memória retornada é o mesmo, mostrando que a instância é a mesma.
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		SingletonLazy lazy2 = SingletonLazy.getInstancia();
		System.out.println(lazy2);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		SingletonEager eager2 = SingletonEager.getInstancia();
		System.out.println(eager2);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		SingletonLazyHolder holder2 = SingletonLazyHolder.getInstancia();
		System.out.println(holder2);
	}
}
