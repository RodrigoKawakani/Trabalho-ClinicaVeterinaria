
package ClinicaVeterinaria;

public class Cavalo extends Animal {

	private static final long serialVersionUID = 1L;

        @Override
	public String alimentacao() {
		return "Ração, aveia e alfafa";
	}
    
        @Override
	public String cuidadosProprios() {
		return "Corrida, trote e limpeza dos cascos";
	}
        
	public Cavalo(String nome, int idade, String dono) {
		super(nome, idade, dono);
		this.especie = "Cavalo";
	}
}
