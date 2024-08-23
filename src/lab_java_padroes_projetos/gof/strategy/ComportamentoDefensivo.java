package lab_java_padroes_projetos.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movendo-se defensivamente...");
	}

}
