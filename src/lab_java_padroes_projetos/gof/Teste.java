package lab_java_padroes_projetos.gof;

import lab_java_padroes_projetos.gof.singleton.SingletonEager;
import lab_java_padroes_projetos.gof.singleton.SingletonLazy;
import lab_java_padroes_projetos.gof.singleton.SingletonLazyHolder;
import lab_java_padroes_projetos.gof.strategy.Comportamento;
import lab_java_padroes_projetos.gof.strategy.ComportamentoAgressivo;
import lab_java_padroes_projetos.gof.strategy.ComportamentoDefensivo;
import lab_java_padroes_projetos.gof.strategy.ComportamentoNormal;
import lab_java_padroes_projetos.gof.strategy.Robo;


public class Teste {
	public static void main(String[] args) {

		//Singleton
		
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
		
		//Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
	}
}
