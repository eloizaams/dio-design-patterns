package lab_java_padroes_projetos.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");
	}


}
